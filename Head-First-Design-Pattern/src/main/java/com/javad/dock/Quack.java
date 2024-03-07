package com.javad.dock;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack quack !!!");
    }
}
