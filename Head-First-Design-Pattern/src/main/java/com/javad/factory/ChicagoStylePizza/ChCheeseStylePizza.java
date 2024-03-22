package com.javad.factory.ChicagoStylePizza;

import com.javad.factory.Pizza;

public class ChCheeseStylePizza implements Pizza {

    public ChCheeseStylePizza() {
        System.out.println("Creating Chicago Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Let's prepare Chicago Style Cheese Pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Let's bake Chicago Style Cheese Pizza ");
    }

    @Override
    public void cut() {
        System.out.println("Let's cut Chicago Style Cheese Pizza ");
    }

    @Override
    public void box() {
        System.out.println("Let's box Chicago Style Cheese Pizza ");
    }
}
