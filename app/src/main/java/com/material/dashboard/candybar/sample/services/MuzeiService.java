package com.material.dashboard.candybar.sample.services;

import android.content.Intent;

import com.dm.material.dashboard.candybar.services.CandyBarMuzeiService;
import com.material.dashboard.candybar.sample.R;

public class MuzeiService extends CandyBarMuzeiService {

    private static final String SOURCE_NAME = "CandyBar:MuzeiArtSource";

    public MuzeiService() {
        super(SOURCE_NAME);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startCommand(intent, flags, startId);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        initMuzeiService();
    }

    @Override
    protected void onTryUpdate(int reason) throws RetryException {
        String wallpaperUrl = getResources().getString(R.string.wallpaper_json);
        tryUpdate(wallpaperUrl);
    }

}
