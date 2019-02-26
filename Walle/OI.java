
package org.usfirst.frc1537.Walle;

import org.usfirst.frc1537.Walle.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class OI {
    
    public JoystickButton button1;
    public JoystickButton button2;
    public JoystickButton button3;
    public JoystickButton button4;
    public JoystickButton button5;
    public JoystickButton button6;
    public JoystickButton on_off;
    public Joystick joystick;
    public Joystick joystick1;

    public OI() {

        joystick = new Joystick(0);
        joystick1 = new Joystick(1);
        
        on_off = new JoystickButton(joystick, 10);
        on_off.toggleWhenPressed(new Drive());
        on_off.toggleWhenPressed(new LiftArm());
        on_off.toggleWhenPressed(new Command4());

        button1 = new JoystickButton(joystick, 3);
        button1.whileHeld(new Command3(1));
        button2 = new JoystickButton(joystick, 4);
        button2.whileHeld(new Command3(-1));

        /*button3 = new JoystickButton(joystick1, 1);
        button3.whileHeld(new Command4(0.55));
        button4 = new JoystickButton(joystick1, 2);
        button4.whileHeld(new Command4(-0.55));*/

        button5 = new JoystickButton(joystick, 1);
        button5.whileHeld(new Command5(-1));
        button6 = new JoystickButton(joystick, 2);
        button6.whileHeld(new Command5(1));
        


    }

    public double getJoystickY() {
    	return joystick.getY();
    }
    
    public double getJoystickX() {
    	return joystick.getX();
    }

    public double getJoystick1Y() {
    	return joystick1.getY();
    }
    
    public double getJoystick1Y2stick() {
    	return joystick1.getRawAxis(5);
    }
}

