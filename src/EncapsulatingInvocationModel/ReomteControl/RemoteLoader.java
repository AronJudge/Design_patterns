package EncapsulatingInvocationModel.ReomteControl;

import EncapsulatingInvocationModel.simple.CeilingFan.CeilingFan;
import EncapsulatingInvocationModel.simple.CeilingFan.CeilingFanHighCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0, ceilingFanHighCommand, ceilingFanHighCommand);
    }
}
