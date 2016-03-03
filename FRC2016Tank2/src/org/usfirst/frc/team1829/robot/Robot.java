
package org.usfirst.frc.team1829.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.lic void teleopPeriodic() {
        Joystick myJoystick = new Joystick(1);
        CANTalon myCANTalon = new CANTalon(1);
        myCANTalon.set(myJoystick.getRawAxis(1));
        
 */
public class Robot extends IterativeRobot{
    /**
     * This function is run when the robot is first started up and should public void teleopPeriodic() {
        Joystick myJoystick = new Joystick(1);
        CANTalon myCANTalon = new CANTalon(1);
        myCANTalon.set(myJoystick.getRawAxis(1));
        
     * used for any initialization code.
     */
	/* talons for arcade drive */
	
	
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.786
     */

	public void robotInit() {
		//next four lines slave CAN ID 8 to 2 and CAN ID 1 to 7
    	rearLeftMotor.changeControlMode(TalonControlMode.Follower);
    	rearRightMotor.changeControlMode(TalonControlMode.Follower);
    	rearLeftMotor.set(2);
    	rearRightMotor.set(7);
    	//inversion constants for left side
		drive.setInvertedMotor(MotorType.kFrontLeft, true);    
		
		
		
	}



		
       
       
        
    

    
    
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Joystick myJoystick = new Joystick(0);
        CANTalon myCANTalon = new CANTalon(1);
        //myCANTalon.set(myJoystick.getRawAxis(0));
        double forward = myJoystick.getRawAxis(0);
        double side = myJoystick.getRawAxis(1);
        drive.arcadeDrive(forward,side);
     
       
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	
    
    }
    
}
