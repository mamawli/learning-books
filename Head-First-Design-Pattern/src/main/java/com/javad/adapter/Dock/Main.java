package com.javad.adapter.Dock;

public class Main {
    public static void main(String[] args) {
        var mallardDock = new MallardDock();
        var turkey = new MyTurkey();
        var adapter = new DockAdapter(turkey);
        System.out.println("turkey");
        turkey.fly();
        turkey.gobble();

        System.out.println("mallard");
        mallardDock.fly();
        mallardDock.quack();

        System.out.println("adapter");
        adapter.fly();
        adapter.quack();
    }
}
