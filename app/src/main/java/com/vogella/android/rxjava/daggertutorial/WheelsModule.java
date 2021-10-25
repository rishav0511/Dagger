package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.Rims;
import com.vogella.android.rxjava.daggertutorial.car.Tires;
import com.vogella.android.rxjava.daggertutorial.car.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheel provideWheels(Rims rims, Tires tires){
        return new Wheel(rims,tires);
    }
}
