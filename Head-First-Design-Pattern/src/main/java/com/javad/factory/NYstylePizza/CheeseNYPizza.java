package com.javad.factory.NYstylePizza;

import com.javad.factory.Pizza;

public class CheeseNYPizza implements Pizza {

    public CheeseNYPizza() {
        System.out.println("Creating NY Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Let's prepare NY Cheese Pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Let's bake NY Cheese Pizza ");
    }

    @Override
    public void cut() {
        System.out.println("Let's cut NY Cheese Pizza ");
    }

    @Override
    public void box() {
        System.out.println("Let's box NY Cheese Pizza ");
    }
}
