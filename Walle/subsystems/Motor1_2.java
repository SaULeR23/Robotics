
package org.usfirst.frc1537.Walle.subsystems;

import org.usfirst.frc1537.Walle.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class Motor1_2 extends Subsystem {

    private final SpeedController motor1 = RobotMap.lift;

    @Override
    public void initDefaultCommand() {
    }

    public void LiftArm(double power) {
        motor1.set(power);
    }

}

