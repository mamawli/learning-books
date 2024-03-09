package com.javad.strategy.character;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void perform() {
        System.out.println("I have sword");
    }
}
