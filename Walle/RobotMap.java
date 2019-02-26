
package org.usfirst.frc1537.Walle;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {

    public static DifferentialDrive driveTrainRobotDrive;
    public static PWMTalonSRX m_frontLeft, m_rearLeft;
    public static PWMTalonSRX m_frontRight, m_rearRight;
    public static SpeedControllerGroup m_right, m_left, lift;

    public static SpeedController motor1motor1;
    public static SpeedController motor2motor2;
    public static SpeedController motor3motor3;
    public static SpeedController motor4motor4;
    public static SpeedController motor5motor5;



    public static void init() {
        m_frontLeft = new PWMTalonSRX(0);
        m_frontLeft.setInverted(false);
        m_rearLeft = new PWMTalonSRX(1);
        m_rearLeft.setInverted(false);
        m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

        m_frontRight = new PWMTalonSRX(2);
        m_frontRight.setInverted(false);
        m_rearRight = new PWMTalonSRX(3);
        m_rearRight.setInverted(false);
        m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
     
        driveTrainRobotDrive = new DifferentialDrive(m_left, m_right);

        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setMaxOutput(-1.0);

        motor1motor1 = new PWMTalonSRX(4);
        motor1motor1.setInverted(false);
        lift = new SpeedControllerGroup(motor1motor1);
        motor2motor2 = new PWMTalonSRX(5);
        motor2motor2.setInverted(false); 
        motor3motor3 = new PWMVictorSPX(6);
        motor3motor3.setInverted(false);
       motor4motor4 = new PWMVictorSPX(7);
       motor4motor4.setInverted(false);
    
    }
}
