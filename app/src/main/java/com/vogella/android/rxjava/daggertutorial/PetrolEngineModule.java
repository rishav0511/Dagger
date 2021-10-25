package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.Engine;
import com.vogella.android.rxjava.daggertutorial.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
