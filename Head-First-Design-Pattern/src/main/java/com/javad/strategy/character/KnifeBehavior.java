package com.javad.strategy.character;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void perform() {
        System.out.println("I have knife");
    }
}
