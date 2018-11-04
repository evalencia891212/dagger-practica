package com.example.emmanuel.daggerapp;

public class Coche {
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public String getMotor()
    {
        return ("Coche con " + motor.getTipoMotor());
    }
}
