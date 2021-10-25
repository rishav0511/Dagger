package com.vogella.android.rxjava.daggertutorial.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){}

    @Override
    public void start() {
        Log.d(TAG, TAG+" Petrol Engine started");
    }
}
