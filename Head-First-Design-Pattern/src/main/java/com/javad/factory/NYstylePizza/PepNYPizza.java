package com.javad.factory.NYstylePizza;

import com.javad.factory.Pizza;

public class PepNYPizza implements Pizza {

    public PepNYPizza() {
        System.out.println("Creating NY peperoni pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Let's prepare NY peperoni pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Let's bake NY peperoni pizza ");
    }

    @Override
    public void cut() {
        System.out.println("Let's cut NY peperoni pizza ");
    }

    @Override
    public void box() {
        System.out.println("Let's box NY peperoni pizza ");
    }
}
