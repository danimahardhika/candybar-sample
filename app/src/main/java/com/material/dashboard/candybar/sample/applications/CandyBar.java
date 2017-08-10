package com.material.dashboard.candybar.sample.applications;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    @Override
    public void onCreate() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        
        initApplication(configuration);
    }
}
