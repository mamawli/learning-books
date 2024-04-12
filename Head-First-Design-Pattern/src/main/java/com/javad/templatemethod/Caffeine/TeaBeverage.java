package com.javad.templatemethod.Caffeine;

public class TeaBeverage extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Using Tea Leaves");
    }

    @Override
    public void addCondiments() {
        System.out.println("Lemon added");
    }

    @Override
    public boolean hook() {
        System.out.println("Do you wanna add lemon ? Y/N");
        return getUserInput().startsWith("Y");
    }
}
