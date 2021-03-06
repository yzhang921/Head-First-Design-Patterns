package headfirst.designpatterns.command.remote.command;

import headfirst.designpatterns.command.remote.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
