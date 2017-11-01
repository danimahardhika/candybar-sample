package com.material.dashboard.candybar.sample.services;

import com.dm.material.dashboard.candybar.services.CandyBarMuzeiService;

public class MuzeiService extends CandyBarMuzeiService {

    private static final String SOURCE_NAME = "CandyBar:MuzeiArtSource";

    public MuzeiService() {
        super(SOURCE_NAME);
    }
}
