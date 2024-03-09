package com.javad.strategy.dock;

public class MallardDock extends Dock {

    public MallardDock() {
        flyBehavior = new WingFly();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I and a mallard dock");
    }
}
