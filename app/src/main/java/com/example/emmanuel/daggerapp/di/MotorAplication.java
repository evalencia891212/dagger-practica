package com.example.emmanuel.daggerapp.di;

import android.app.Application;

import dagger.android.DaggerActivity;

public class MotorAplication extends Application{

    private MotorComponent motorComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();

        motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponent getMotorComponent()
    {
        return  motorComponent;
    }

}
