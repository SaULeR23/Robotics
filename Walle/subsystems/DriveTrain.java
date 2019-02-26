
package org.usfirst.frc1537.Walle.subsystems;

import org.usfirst.frc1537.Walle.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

    private final DifferentialDrive robotDrive = RobotMap.driveTrainRobotDrive;

    @Override
    public void initDefaultCommand() {
    }

    public void driveWithJoystick(double jLeft, double jRight) {
        robotDrive.arcadeDrive(jLeft, jRight);
    }
}

