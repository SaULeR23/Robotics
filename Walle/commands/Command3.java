
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;

public class Command3 extends Command {

    double a = 0.0;

    public Command3(double side) {
        requires(Robot.motor3);
        a = side;
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.motor3.vint(a);
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        Robot.motor3.vint(0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
