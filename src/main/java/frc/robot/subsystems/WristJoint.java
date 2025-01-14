package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class WristJoint extends SubsystemBase {
    public static final Command WristCommand = null;
    private TalonSRX spin = new TalonSRX(Constants.Joint.spin);

public WristJoint(){
    spin.setNeutralMode(NeutralMode.Brake);
}

public void spinUp(double multiplier){
    spin.set(TalonSRXControlMode.PercentOutput, (0.8)*(multiplier));


}

}
