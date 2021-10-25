package com.vogella.android.rxjava.daggertutorial;

import android.app.Application;

public class ExampleApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Rishav"));
    }
    public AppComponent getAppComponent(){
        return component;
    }
}
