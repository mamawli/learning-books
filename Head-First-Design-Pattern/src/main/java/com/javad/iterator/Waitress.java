package com.javad.iterator;

public class Waitress {

    BreakMenu breakMenu;
    DinnerMenu dinnerMenu;

    public Waitress(BreakMenu breakMenu, DinnerMenu dinnerMenu) {
        this.breakMenu = breakMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator breakIterator = breakMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("BreakFast ---- -- - -- - - - -");
        printMenu(breakIterator);

        System.out.println("Dinner --- - - -- - -- -- - - ");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = iterator.next();
            System.out.println("Title is " + next.getTitle());
            System.out.println("price is " + next.getPrice());
        }
    }
}
