package com.material.dashboard.candybar.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarSplashActivity;

public class SplashActivity extends CandyBarSplashActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initSplashActivity(savedInstanceState, MainActivity.class);
    }
}
