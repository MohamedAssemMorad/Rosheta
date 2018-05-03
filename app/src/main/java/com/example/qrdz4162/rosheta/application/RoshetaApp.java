package com.example.qrdz4162.rosheta.application;

import android.app.Application;

/**
 * Created by qrdz4162 on 5/3/2018.
 */

public class RoshetaApp extends Application {

    private static RoshetaApp roshetaApp;

    public static RoshetaApp getInstance(){
        if (roshetaApp == null)
            throw new IllegalStateException("something went wrong !!, no application attched");

        return roshetaApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        roshetaApp = this;
    }
}
