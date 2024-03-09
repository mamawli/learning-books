package com.javad.strategy.dock;

public class WingFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I have two wings and fly ! =)");
    }
}
