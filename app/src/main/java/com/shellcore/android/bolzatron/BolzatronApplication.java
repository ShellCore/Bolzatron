package com.shellcore.android.bolzatron;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Shell on 09/11/2017.
 */

public class BolzatronApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        databaseTearDown();
    }

    private void setupDatabase() {
        FlowManager.init(this);
    }

    private void databaseTearDown() {
        FlowManager.destroy();
    }
}
