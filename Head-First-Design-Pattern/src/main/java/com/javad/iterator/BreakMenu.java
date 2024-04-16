package com.javad.iterator;

public class BreakMenu implements Menu {

    private MenuItem[] menuItems;

    public BreakMenu(){
        menuItems = new MenuItem[2];
        menuItems[0] = new MenuItem("pancake", 1d);
        menuItems[1] = new MenuItem("egg", 3d);
    }
    @Override
    public Iterator createIterator() {
        return new BreakIterator(menuItems);
    }
}
