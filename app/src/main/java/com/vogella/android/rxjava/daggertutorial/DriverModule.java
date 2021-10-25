package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driveName;
    public DriverModule(String driveName){
        this.driveName=driveName;
    }
    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(driveName);
    }
}
