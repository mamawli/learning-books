package com.javad.observer.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewsAgency implements Subject{

    private final List<Channel> channels;

    public NewsAgency(){
        channels = new ArrayList<>();
    }
    @Override
    public void addSubscriber(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeSubscriber(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void notifySubscriber() {
        channels.forEach(Channel::update);
    }
}
