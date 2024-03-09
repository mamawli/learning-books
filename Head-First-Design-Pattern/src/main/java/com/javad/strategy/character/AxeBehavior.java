package com.javad.strategy.character;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void perform() {
        System.out.println("I have axe");
    }
}
