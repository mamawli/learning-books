package com.javad.templatemethod.Caffeine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coffee Recep");
        var coffee = new CoffeeBeverage();
        coffee.prepare();

        System.out.println("-------------------------------");

        System.out.println("Tea Recep");
        var tea = new TeaBeverage();
        tea.prepare();
    }
}
