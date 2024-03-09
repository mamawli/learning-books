package com.javad.strategy.dock;

public class Main {

    public static void main(String[] args) {
        System.out.println("---Mallard Dock---");
        Dock mallard = new MallardDock();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        System.out.println("---Woody Dock---");
        Dock woody = new WoodyDock();
        woody.performFly();
        woody.performQuack();
        woody.display();
    }
}
