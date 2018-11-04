package com.example.emmanuel.daggerapp;

public class Motor {
    private String tipoMotor;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor()
    {
        return ("Motor : " + tipoMotor);
    }

}
