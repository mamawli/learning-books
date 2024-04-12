package com.javad.templatemethod.Caffeine;

import java.util.Scanner;

public abstract class CaffeineBeverage {

    private static final Scanner scanner = new Scanner(System.in);

    public void prepare() {
        boilWater();
        brew();
        pour();
        if (hook())
            addCondiments();
    }

    public String getUserInput(){
        return scanner.next();
    }
    public void boilWater() {
        System.out.println("The watter is boiling");
    }

    public void pour() {
        System.out.println("Pour in cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public abstract boolean hook();

}
