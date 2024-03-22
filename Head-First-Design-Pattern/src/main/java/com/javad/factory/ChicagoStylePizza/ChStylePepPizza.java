package com.javad.factory.ChicagoStylePizza;

import com.javad.factory.Pizza;

public class ChStylePepPizza implements Pizza {

    public ChStylePepPizza() {

        System.out.println("Creating Chicago Peperoni style Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Let's prepare Chicago Peperoni style Pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Let's bake Chicago Peperoni style Pizza ");
    }

    @Override
    public void cut() {
        System.out.println("Let's cut Chicago Peperoni style Pizza ");
    }

    @Override
    public void box() {
        System.out.println("Let's box Chicago Peperoni style Pizza ");
    }
}
