package com.javad.strategy.dock;

public class WoodyDock extends Dock {

    public WoodyDock() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println(" I am wood");
    }
}
