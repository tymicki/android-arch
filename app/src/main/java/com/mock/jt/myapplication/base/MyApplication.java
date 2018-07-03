package com.mock.jt.myapplication.base;

import android.app.Application;

public class MyApplication extends Application {

    private ApplicationComponent component;


    @Override public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

    }
}
