package com.javad.adapter.Dock;

public class MallardDock implements Dock{
    @Override
    public void quack() {
        System.out.println("Quack Quack !");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
