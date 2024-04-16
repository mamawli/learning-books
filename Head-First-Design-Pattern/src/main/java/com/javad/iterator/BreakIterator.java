package com.javad.iterator;

public class BreakIterator implements Iterator{

    private MenuItem[] menuItems;
    private int pos =0;

    public BreakIterator(MenuItem[] items){
        this.menuItems = items;
    }
    @Override
    public boolean hasNext() {
        return menuItems.length > pos;
    }

    @Override
    public MenuItem next() {
        return menuItems[pos++];
    }
}
