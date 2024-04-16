package com.javad.iterator;

public class Main {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        BreakMenu breakMenu = new BreakMenu();

        var waitress = new Waitress(breakMenu, dinnerMenu);

        waitress.printMenu();

    }
}
