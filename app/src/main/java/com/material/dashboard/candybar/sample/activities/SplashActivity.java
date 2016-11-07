package com.material.dashboard.candybar.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarSplashActivity;
import com.material.dashboard.candybar.sample.R;

public class SplashActivity extends CandyBarSplashActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        int duration = getResources().getInteger(R.integer.splash_screen_duration);
        initSplashActivity(savedInstanceState, MainActivity.class, duration);
    }
}
