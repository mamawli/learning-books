package com.javad.facade.movie;

public class HomeTheatreFacade {

    Amplifier amplifier;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    StreamingPlayer streamingPlayer;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheatreFacade(Amplifier amplifier, PopcornPopper popcornPopper, Projector projector, Screen screen, StreamingPlayer streamingPlayer, TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.streamingPlayer = streamingPlayer;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    public void watchMovie(String movie){
        System.out.println(movie + " is starting!!!");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        amplifier.setSurroundSound(5);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shut down movie ......");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        streamingPlayer.stop();
        streamingPlayer.off();

    }
}
