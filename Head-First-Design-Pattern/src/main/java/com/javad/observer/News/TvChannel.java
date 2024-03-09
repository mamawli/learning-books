package com.javad.observer.News;

public class TvChannel implements Channel {
    @Override
    public void update() {
        System.out.println("get news from tv channel");
    }
}
