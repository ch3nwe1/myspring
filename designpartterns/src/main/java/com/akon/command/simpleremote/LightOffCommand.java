package com.akon.command.simpleremote;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * 关灯
     */
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
