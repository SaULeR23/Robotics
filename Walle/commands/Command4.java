
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;

public class Command4 extends Command {


    public Command4() {
        requires(Robot.motor4);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    	Robot.motor4.vint(Robot.oi.getJoystick1Y2stick());
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        Robot.motor4.vint(0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
