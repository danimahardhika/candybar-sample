package com.material.dashboard.candybar.sample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.material.dashboard.candybar.sample.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity();
    }

    private void startActivity() {
        boolean showSplashScreen = getResources().getBoolean(R.bool.use_splash_screen);
        startActivity(new Intent(this, showSplashScreen ?
                SplashActivity.class : MainActivity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }
}
