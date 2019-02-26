
package org.usfirst.frc1537.Walle.subsystems;

import org.usfirst.frc1537.Walle.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class Motor3 extends Subsystem {

    private final SpeedController motor3 = RobotMap.motor2motor2;

    @Override
    public void initDefaultCommand() {
    }

    public void vint(double power) {
        motor3.set(power);
    }
}

