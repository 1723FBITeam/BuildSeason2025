package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.WristJoint;


public class WristCommand extends Command {
    private WristJoint wristJoint;

    public WristCommand(WristJoint wristJoint){
        this.wristJoint = wristJoint;


    }

public void execute(){
wristJoint.spinUp(.1);

}

public void end(){
    wristJoint.spinUp(0);
}



}
