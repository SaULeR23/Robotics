
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;


public class Drive extends Command {

    public Drive() {
        requires(Robot.driveTrain);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    	Robot.driveTrain.driveWithJoystick(Robot.oi.getJoystickY(), -(Robot.oi.getJoystickX()));
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
    	Robot.driveTrain.driveWithJoystick(0,0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
