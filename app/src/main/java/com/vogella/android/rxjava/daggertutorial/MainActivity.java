package com.vogella.android.rxjava.daggertutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.vogella.android.rxjava.daggertutorial.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //Constructor -> Field -> Method
    @Inject Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentBuilder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
//        car = carComponent.getCar();      //Constructor Injection
        activityComponent.inject(this);      //Field Injection

        car1.drive();
        car2.drive();
    }
}