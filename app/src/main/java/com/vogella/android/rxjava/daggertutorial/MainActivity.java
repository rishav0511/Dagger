package com.vogella.android.rxjava.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //Constructor -> Field -> Method
    @Inject Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.create();
//        car = carComponent.getCar();      //Constructor Injection
        carComponent.inject(this);      //Field Injection

        car.drive();
    }
}