package com.javad.factory;

import com.javad.factory.NYstylePizza.CheeseNYPizza;
import com.javad.factory.NYstylePizza.PepNYPizza;

public class NYStylePizzaFactory extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("pep"))
            return new PepNYPizza();
        else if (type.equals("cheese"))
            return new CheeseNYPizza();
        else
            throw new RuntimeException("WTF");
    }
}
