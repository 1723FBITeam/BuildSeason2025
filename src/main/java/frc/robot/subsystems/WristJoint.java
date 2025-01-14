package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
// import com.revrobotics.spark.config.SparkMaxConfig;

public class WristJoint extends SubsystemBase {
    // private TalonSRX spin = new TalonSRX(Constants.Joint.spin);
    private final SparkMax motor;
    private final SparkMaxConfig config;

    public WristJoint() {
        // spin.setNeutralMode(NeutralMode.Brake);
        // this.m_sparkMotor = new CANSparkMax(0, MotorType.kBrushless);
        motor = new SparkMax(12, MotorType.kBrushless);
        config = new SparkMaxConfig();
        motor.configure(config, ResetMode.kNoResetSafeParameters, PersistMode.kPersistParameters);

    }

    public void spinUp(double multiplier) {
        // spin.set(TalonSRXControlMode.PercentOutput, (0.8)*(multiplier));
        motor.set(multiplier);
    }

}
