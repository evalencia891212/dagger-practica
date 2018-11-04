package com.example.emmanuel.daggerapp.di;

import com.example.emmanuel.daggerapp.Coche;
import com.example.emmanuel.daggerapp.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor PorvidesMotorDiesel()
    {
        return new Motor("Diesel");
    }

    @Named("gasolina")
    @Provides
    public Motor PorvidesMotorGasolina()
    {
        return new Motor("Gasolina");
    }

    @Provides
    public Coche ProvidesCoche(@Named("gasolina")Motor motor)
        {
          return new Coche(motor);
        }


}
