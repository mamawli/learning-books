package com.javad.iterator;

import java.util.List;

public class DinnerIterator implements Iterator {

    List<MenuItem> menuItemList;
    int position = 0;

    public DinnerIterator(List<MenuItem> dinnerMenu) {
        this.menuItemList = dinnerMenu;
    }

    @Override
    public boolean hasNext() {
        return menuItemList.size() > position;
    }

    @Override
    public MenuItem next() {
        return menuItemList.get(position++);
    }
}
