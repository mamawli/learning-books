package com.javad.strategy.character;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void perform() {
        System.out.println("I have Bow and Arrow");
    }
}
