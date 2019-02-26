
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;

public class Command5 extends Command {

    double a = 0.0;

    public Command5(double side) {
        requires(Robot.motor5);
        a = side;
    }

        @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.motor5.vint(a);
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        Robot.motor5.vint(0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
