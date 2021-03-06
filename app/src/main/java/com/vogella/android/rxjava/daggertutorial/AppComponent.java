package com.vogella.android.rxjava.daggertutorial;

import com.vogella.android.rxjava.daggertutorial.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }
}
