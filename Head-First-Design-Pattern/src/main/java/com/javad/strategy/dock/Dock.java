package com.javad.strategy.dock;

public abstract class Dock {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Dock() {
    }

    protected abstract void display();

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void swim() {
        System.out.println("All types swims same!");
    }
}
