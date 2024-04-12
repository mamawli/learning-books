package com.javad.templatemethod.Caffeine;

public class CoffeeBeverage extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brew Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Milk and Sugar added");
    }

    @Override
    public boolean hook() {
        System.out.println("Do You wanna to add milk and sugar? Y/N");
        return getUserInput().startsWith("Y");
    }
}
