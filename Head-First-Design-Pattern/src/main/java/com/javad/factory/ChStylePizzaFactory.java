package com.javad.factory;

import com.javad.factory.ChicagoStylePizza.ChCheeseStylePizza;
import com.javad.factory.ChicagoStylePizza.ChStylePepPizza;

public class ChStylePizzaFactory extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("pep"))
            return new ChStylePepPizza();
        else if (type.equals("cheese"))
            return new ChCheeseStylePizza();
        else
            throw new RuntimeException("WTF");
    }
}
