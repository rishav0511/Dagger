package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.DieselEngine;
import com.vogella.android.rxjava.daggertutorial.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
