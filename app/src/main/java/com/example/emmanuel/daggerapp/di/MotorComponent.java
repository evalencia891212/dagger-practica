package com.example.emmanuel.daggerapp.di;

import com.example.emmanuel.daggerapp.MainActivity;

import dagger.Component;

@PerActivity
@Component(modules = MotorModule.class)
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
