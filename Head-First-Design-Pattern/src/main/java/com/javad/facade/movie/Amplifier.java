package com.javad.facade.movie;

import java.nio.file.Paths;

public class Amplifier {

    public void on(){
        System.out.println("Amplifier is on");
    }

    public void off(){
        System.out.println("Amplifier is off");
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        streamingPlayer.name();
    }

    public void setSurroundSound(int aroundSound) {
        System.out.println(" Around Amp Sound is " + aroundSound);
    }
}
