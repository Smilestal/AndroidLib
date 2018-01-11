package com.crystal.library;

import android.app.Application;

import com.crystal.library.tools.CrashHandler;

/**
 * Created by GanJinjin on 2018/1/11.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
