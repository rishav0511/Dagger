package com.vogella.android.rxjava.daggertutorial.car;

public class Wheel {
    //We don't own this class so we can't annotate it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims,Tires tires){
        this.rims=rims;
        this.tires=tires;
    }
}
