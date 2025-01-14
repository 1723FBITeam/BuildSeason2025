package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.WristJoint;

public class WristCommandUp extends Command {
    private WristJoint wristJoint;

    public WristCommandUp(WristJoint wristJoint) {
        this.wristJoint = wristJoint;

    }

    @Override
    public void execute() {
        wristJoint.spinUp(.1);
    }


    public void end() {
        wristJoint.spinUp(0);
    }

}
