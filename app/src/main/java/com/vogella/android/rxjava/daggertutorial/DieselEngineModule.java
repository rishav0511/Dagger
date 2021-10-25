package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.DieselEngine;
import com.vogella.android.rxjava.daggertutorial.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
