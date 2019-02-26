
package org.usfirst.frc1537.Walle;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

//import org.usfirst.frc1537.Walle.commands.Drive;
import org.usfirst.frc1537.Walle.subsystems.*;


public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();

    public static OI oi;

    public static DriveTrain driveTrain;
    public static Motor1_2 motor1;
    public static Motor3 motor3;
    public static Motor4 motor4;
    public static Motor5 motor5;


    @Override
    public void robotInit() {
        CameraServer.getInstance().startAutomaticCapture();
        RobotMap.init();
        driveTrain = new DriveTrain();
        motor1 = new Motor1_2();
        motor3 = new Motor3();
        motor4 = new Motor4();
        motor5 = new Motor5();


        oi = new OI();


        //chooser.addDefault("Autonomous Command", new Drive());

        SmartDashboard.putData("Auto mode", chooser);
    }

    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        if (autonomousCommand != null) autonomousCommand.start();
    }


    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }


    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
