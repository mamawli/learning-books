package com.javad.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi I'm mamal I want peperoni pizza that I want be NY style");
        System.out.println("_____ process of ny style pep pizza ______");

        Pizza pep = new NYStylePizzaFactory().orderPizza("pep");

        System.out.println("this is your pizza number " + pep.toString());

        System.out.println("Hi I'm mamaloo I want cheese pizza that I want be Chicago style");
        System.out.println("_____ process of CH style cheese pizza ______");

        Pizza cheese = new ChStylePizzaFactory().orderPizza("cheese");

        System.out.println("this is your pizza number " + cheese.toString());
    }
}
