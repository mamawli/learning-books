package com.javad.facade.movie;

public class Main {

    public static void main(String[] args) {
        var amp = new Amplifier();
        var popper = new PopcornPopper();
        var projector = new Projector();
        var screen = new Screen();
        var player = new StreamingPlayer();
        var lights = new TheaterLights();
        var tuner = new Tuner();

        var homeTheatreFacade = new HomeTheatreFacade(amp, popper, projector, screen, player, lights, tuner);

        homeTheatreFacade.watchMovie("Javads go to haven");

        homeTheatreFacade.endMovie();
    }
}
