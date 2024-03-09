package com.javad.observer.News;

public class NewsChannel implements Channel {

    @Override
    public void update() {
        System.out.println("the data from news channel");
    }
}
