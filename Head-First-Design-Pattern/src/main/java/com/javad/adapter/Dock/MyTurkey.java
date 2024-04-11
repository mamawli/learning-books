package com.javad.adapter.Dock;

public class MyTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly too");
    }
}
