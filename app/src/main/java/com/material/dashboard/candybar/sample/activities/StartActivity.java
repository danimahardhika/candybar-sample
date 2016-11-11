package com.material.dashboard.candybar.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarStartActivity;

public class StartActivity extends CandyBarStartActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initStartActivity(savedInstanceState, SplashActivity.class, MainActivity.class);
    }

}
