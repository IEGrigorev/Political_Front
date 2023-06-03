package com.example.grigorev_smsng;

import android.content.SharedPreferences;

public class PrefsManager {
    public final static String NAME = "MY GAME";
    private final static String KEY_SCORE = "KEY_SCORE";
    private final static String KEY_AuthNation = "KEY_AuthNation";
    private final static String KEY_AuthParty = "KEY_AuthParty";
    private final static String KEY_AuthArmy = "KEY_AuthArmy";
    private final static String KEY_Treasure = "KEY_Treasure";
    private final static String KEY_Infra = "KEY_Infra";
    private final static String KEY_YourSave = "KEY_YourSave";
    private final static String KEY_MassMediaF = "KEY_MassMediaF";
    private final static String KEY_Cost = "KEY_Cost";
    private final static String KEY_NumbQuest = "KEY_NumbQuest";
    private final static String KEY_Detecter = "KEY_Detecter";
    private final static String KEY_Month = "KEY_Month";


    private final SharedPreferences sharedPreferences;

    public PrefsManager(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public void setScore(int score) {
        sharedPreferences.edit()
                .putInt(KEY_SCORE, score)
                .apply();
    }

    public void setAuthNation(int authorityNation) {
        sharedPreferences.edit()
                .putInt(KEY_AuthNation, authorityNation)
                .apply();
    }

    public void setAuthParty(int authorityParty) {
        sharedPreferences.edit()
                .putInt(KEY_AuthParty, authorityParty)
                .apply();
    }

    public void setAuthArmy(int authorityArmy) {
        sharedPreferences.edit()
                .putInt(KEY_AuthArmy, authorityArmy)
                .apply();
    }

    public void setTreasure(int treasure) {
        sharedPreferences.edit()
                .putInt(KEY_Treasure, treasure)
                .apply();
    }

    public void setInfra(int infrastructure) {
        sharedPreferences.edit()
                .putInt(KEY_Infra, infrastructure)
                .apply();
    }

    public void setYourSave(int yourSafety) {
        sharedPreferences.edit()
                .putInt(KEY_YourSave, yourSafety)
                .apply();
    }

    public void setMassMediaF(int massMediaFreedom) {
        sharedPreferences.edit()
                .putInt(KEY_MassMediaF, massMediaFreedom)
                .apply();
    }

    public void setCost(int cost) {
        sharedPreferences.edit()
                .putInt(KEY_Cost, cost)
                .apply();
    }

    public void setNumbQuest(int numbQuest) {
        sharedPreferences.edit()
                .putInt(KEY_NumbQuest, numbQuest)
                .apply();
    }
    public void setMonth(int month) {
        sharedPreferences.edit()
                .putInt(KEY_Month, month)
                .apply();
}
    public void setDetector(int detecter) {
        sharedPreferences.edit()
                .putInt(KEY_Detecter, detecter)
                .apply();
    }

    public int getDetector(){return sharedPreferences.getInt(KEY_Detecter,0);}

    public void setALL(int authorityNation, int authorityParty, int authorityArmy, int treasure,
                       int infrastructure, int yourSafety, int massMediaFreedom, int cost, int numbQuest, int month ) {
        setAuthNation(authorityNation);
        setAuthParty(authorityParty);
        setAuthArmy(authorityArmy);
        setTreasure(treasure);
        setInfra(infrastructure);
        setYourSave(yourSafety);
        setMassMediaF(massMediaFreedom);
        setCost(cost);
        setNumbQuest(numbQuest);
        setMonth(month);
    }



    public int getScore() {
        return sharedPreferences.getInt(KEY_SCORE, 0);
    }
    public int getAuthNation() {
        return sharedPreferences.getInt(KEY_AuthNation, 0);
    }
    public int getAuthParty() {
        return sharedPreferences.getInt(KEY_AuthParty, 0);
    }
    public int getAuthArmy() {
        return sharedPreferences.getInt(KEY_AuthArmy, 0);
    }
    public int getTreasure() {
        return sharedPreferences.getInt(KEY_Treasure, 0);
    }
    public int getInfra() {
        return sharedPreferences.getInt(KEY_Infra, 0);
    }
    public int getYourSave() {
        return sharedPreferences.getInt(KEY_YourSave, 0);
    }
    public int getMassMediaF() {
        return sharedPreferences.getInt(KEY_MassMediaF, 0);
    }
    public int getCost() {
        return sharedPreferences.getInt(KEY_Cost, 0);
    }
    public int getNumbQuest() {
        return sharedPreferences.getInt(KEY_NumbQuest, 0);
    }
    public int getMonth() {
        return sharedPreferences.getInt(KEY_Month, 0);
    }

}
