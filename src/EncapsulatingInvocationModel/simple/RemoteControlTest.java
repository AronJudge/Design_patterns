package EncapsulatingInvocationModel.simple;

import EncapsulatingInvocationModel.simple.GarageDoor.GarageDoor;
import EncapsulatingInvocationModel.simple.GarageDoor.GarageDoorOpenCommand;
import EncapsulatingInvocationModel.simple.Light.Light;
import EncapsulatingInvocationModel.simple.Light.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {


        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();


    }
}
