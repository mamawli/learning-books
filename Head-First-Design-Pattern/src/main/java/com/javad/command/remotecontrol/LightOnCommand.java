package com.javad.command.remotecontrol;

public class LightOnCommand extends Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    void execute() {
        light.setStatus(true);
        System.out.println("light status is " + light.isStatus());
    }
}
