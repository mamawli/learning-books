package com.javad.observer.News;

public class Main {

    public static void main(String[] args) {

        Channel news = new NewsChannel();
        Channel tv = new TvChannel();

        Subject subject = new NewsAgency();
        subject.addSubscriber(news);
        subject.addSubscriber(tv);

        subject.notifySubscriber();

        subject.removeSubscriber(tv);

        subject.notifySubscriber();

    }
}
