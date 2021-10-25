package com.vogella.android.rxjava.daggertutorial.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheel wheel;
    private Driver driver;

    @Inject
    public Car(Driver driver,Engine engine, Wheel wheel) {
        this.driver=driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, TAG+" "+driver+" drives "+this);
    }
}
