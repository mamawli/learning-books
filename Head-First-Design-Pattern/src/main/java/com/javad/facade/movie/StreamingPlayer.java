package com.javad.facade.movie;

public class StreamingPlayer {

    public void on() {
        System.out.println(" StreamingPlayer is on ");
    }

    public void off() {
        System.out.println(" StreamingPlayer is off");
    }

    public void name() {
        System.out.println(" Javad Streaming player");
    }

    public void play(String movie) {
        System.out.println(movie + " is playing now!");
    }

    public void stop() {
        System.out.println("Amplifier is stopping .... ");
    }
}
