package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
