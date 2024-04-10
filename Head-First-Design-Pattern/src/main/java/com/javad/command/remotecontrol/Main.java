package com.javad.command.remotecontrol;

public class Main {
    public static void main(String[] args) {

        var remote = new RemoteControl();
        Light light = new Light();
        var lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.pressButton();
    }
}
