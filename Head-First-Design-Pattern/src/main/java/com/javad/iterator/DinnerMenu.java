package com.javad.iterator;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu{

    private List<MenuItem> menuItems;

    public DinnerMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("pizza", 10d));
        menuItems.add(new MenuItem("burger", 7d));
        menuItems.add(new MenuItem("pasta", 7d));
    }

    @Override
    public Iterator createIterator() {
        return new DinnerIterator(menuItems);
    }
}
