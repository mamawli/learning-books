package com.javad.singleton;

public class SingletonSample {

    private static final SingletonSample singletonSample = new SingletonSample();

    private SingletonSample() {
    }

    public static SingletonSample getInstance() {
        return singletonSample;
    }

}
