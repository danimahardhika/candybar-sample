package com.material.dashboard.candybar.sample.activities;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.activities.CandyBarSplashActivity;
import com.dm.material.dashboard.candybar.activities.configurations.SplashScreenConfiguration;
import com.material.dashboard.candybar.sample.R;

public class SplashActivity extends CandyBarSplashActivity {

    @NonNull
    @Override
    public SplashScreenConfiguration onInit() {
        return new SplashScreenConfiguration(MainActivity.class)
                .setBottomText(getString(R.string.splash_screen_title));
    }
}
