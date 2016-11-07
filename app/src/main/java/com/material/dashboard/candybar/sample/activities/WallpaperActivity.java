package com.material.dashboard.candybar.sample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarWallpaperActivity;

public class WallpaperActivity extends CandyBarWallpaperActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initWallpaperActivity(savedInstanceState, getIntent());
    }
}
