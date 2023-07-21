package com.example;

public class Singleton {

    static Singleton singleton;

    private Singleton() {
        
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        } 
        return singleton;
    }

    public boolean activo() {
        return true;
    }
}
