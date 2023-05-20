package com.example.grigorev_smsng;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grigorev_smsng.databinding.ActivityGameBinding;
import com.example.grigorev_smsng.databinding.ItemButtonBinding;


public class GameActivity extends AppCompatActivity {
    private final Quest quest = new Quest();

    private ActivityGameBinding binding;
    private PrefsManager prefsManager;

    public static Intent newInstance(Context context) {
        return new Intent(context, GameActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGameBinding.inflate(getLayoutInflater());
        prefsManager = new PrefsManager(getSharedPreferences(PrefsManager.NAME, MODE_PRIVATE));

        setContentView(binding.getRoot());
        initQuestion(0, 100, 100, 500, 50, 100, 100, 50, 50);
    }

    private void initQuestion(int stepNumber, int authorityNation, int authorityParty, int treasure,
                              int massMediaFreedom, int authorityArmy, int infrastructure, int yourSafety, int cost) {
        binding.score.setText("Месяц: " + quest.getScore());
        binding.TauthorityNation.setText("Народное доверие: " + quest.getAuthorityNation()+"%");
        binding.TauthorityParty.setText("Авторитет в партии: " + quest.getAuthorityParty()+"%");
        binding.TauthorityArmy.setText("Уважение армии: " + quest.getAuthorityArmy()+"%");
        binding.Ttreasure.setText("Казна: " + quest.getTreasure());
        binding.Tinfrastructure.setText("Инфраструктура: " + quest.getInfrastructure()+"%");
        binding.TyourSafety.setText("Личная безопасность: " + quest.getYourSafety()+"%");
        binding.TmassMediaFreedom.setText("Свобода СМИ: " + quest.getMassMediaFreedom()+"%");
        binding.Tcost.setText("Расходы в месяц: " + quest.getCost());

        switch (stepNumber) {
            case -1:
                setNationRevoltEndState();
                break;
            case -2:
                setCivilWarEndState();
                break;
            default:
                setQuestionState(stepNumber);
                break;
        }
        if (quest.getAuthorityNation()<5) setNationRevoltEndState();
        if(quest.getAuthorityNation()<10 && quest.getYourSafety()<10) setNationRevoltEndState();
        if(quest.getTreasure()<1) setEconomicEndState();
        if(quest.getAuthorityNation()<10 && quest.getAuthorityArmy()<10) setArmyRevoltEndState();
        if(quest.getAuthorityParty()<40 && quest.getYourSafety()<10 ) setPartyRevoltEndState();
        if(quest.getAuthorityNation()<5 && quest.getAuthorityArmy()>50) setCivilWarEndState();
        if(quest.getInfrastructure()<20) setNationRevoltEndState();
    }


    private void setQuestionState(int stepNumber) {
        Quest.Question question = quest.getQuestion(stepNumber);
        binding.description.setText(question.getDescription());
        fillButtons(question.getAnswers());
        int authorityNation= quest.getAuthorityNation();
        int authorityParty= quest.getAuthorityParty();
        int treasure=quest.getTreasure();
        int massMediaFreedom=quest.getMassMediaFreedom();
        int authorityArmy=quest.getAuthorityArmy();
        int infrastructure=quest.getInfrastructure();
        int yourSafety=quest.getYourSafety();
        int cost=quest.getCost();
    }


    private void setNationRevoltEndState() {
        binding.description.setText("Разочарованные граждане решили, что им не нужен такой президент как вы. Ваша охрана не смогла защитить вас от народного гнева.");
        fillCloseButton();
        writeBestScore();
    }

    private void setEconomicEndState() {
        binding.description.setText("Деньги в казне закончились. Страна оказалась в состоянии кризиса");
        fillCloseButton();
        writeBestScore();
    }

    private void setArmyRevoltEndState() {
        binding.description.setText("Вы и ваша партия достаточно надоели народу. Армия отказалась защищать правительство и вы были свергнуты.");
        fillCloseButton();
        writeBestScore();
    }
    private void setPartyRevoltEndState() {
        binding.description.setText("Вы часто игнорировали интересы партии, что сильно не понравилось ее членам. На вас было совершено покушение.");
        fillCloseButton();
        writeBestScore();
    }
    private void setCivilWarEndState() {
        binding.description.setText("Народ, недовольный вашими действиями, начал вооруженное восстание, но армия встала на вашу защиту. Все это привело к войне.");
        fillCloseButton();
        writeBestScore();
    }



    private void writeBestScore() {
        prefsManager.setScore(Math.max(prefsManager.getScore(), quest.getScore()));
    }

    private void fillCloseButton() {
        binding.buttons.removeAllViews();

        ItemButtonBinding buttonBinding = ItemButtonBinding.inflate(
                getLayoutInflater(),
                binding.buttons,
                false
        );
        buttonBinding.getRoot().setText("Выйти в меню");
        buttonBinding.getRoot().setOnClickListener(v -> finish());
        binding.buttons.addView(buttonBinding.getRoot());
    }

    private void fillButtons(Quest.Question.Answer[] answers) {
        binding.buttons.removeAllViews();
        for (Quest.Question.Answer answer : answers) {
            ItemButtonBinding buttonBinding = ItemButtonBinding.inflate(
                    getLayoutInflater(),
                    binding.buttons,
                    false
            );
            buttonBinding.getRoot().setText(answer.getName());
            buttonBinding.getRoot().setOnClickListener(v -> goNext(answer));
            binding.buttons.addView(buttonBinding.getRoot());
        }
    }

    private void goNext(Quest.Question.Answer answer) {
        quest.addScore(answer.getScore());
        quest.addAuthorityNation(answer.getAuthorityNation());
        quest.addAuthorityParty(answer.getAuthorityParty());
        quest.addMassMediaFreedom(answer.getMassMediaFreedom());
        quest.addAuthorityArmy(answer.getAuthorityArmy());
        quest.addInfrastructure(answer.getInfrastructure());
        quest.addTreasure(answer.getTreasure());
        quest.addCost(answer.getCost());
        quest.addYourSafety(answer.getYourSafety());
        initQuestion(answer.getNextStep(), answer.getAuthorityNation(), answer.getAuthorityParty(), answer.getTreasure(),
                answer.getMassMediaFreedom(), answer.getAuthorityArmy(), answer.getInfrastructure(), answer.getYourSafety(), answer.getCost() );
    }
}