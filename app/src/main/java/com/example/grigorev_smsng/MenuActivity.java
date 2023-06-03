package com.example.grigorev_smsng;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grigorev_smsng.databinding.ActivityMenuBinding;


public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;
    private PrefsManager prefsManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        prefsManager = new PrefsManager(getSharedPreferences(PrefsManager.NAME, MODE_PRIVATE));

        setContentView(binding.getRoot());
        loadBestResult();
        binding.play.setOnClickListener(v -> {
            startActivity(GameActivity.newInstance(this));
        });
        binding.loadGame.setOnClickListener(v -> {
            prefsManager.setDetector(1);
            startActivity(GameActivity.newInstance(this));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadBestResult();
    }

    private void loadBestResult() {
        binding.score.setText("Лучший результат: " + prefsManager.getScore()+" месяцев");
    }
}