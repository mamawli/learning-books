package com.javad.observer.News;

public interface Subject {

    void addSubscriber(Channel channel);

    void removeSubscriber(Channel channel);

    void notifySubscriber();
}
