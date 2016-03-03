package org.usfirst.frc.team1829.robot.subsystems;

import org.usfirst.frc.team1829.robot.commands.OperateJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	//CANTALON 
	private CANTalon leftMaster;
	private CANTalon leftSlave;
	private CANTalon rightMaster;
	private CANTalon rightSlave;
	private RobotDrive myDrive;
	
	
	public Drive () {
		//constructors in method implements the obvious uses of the drive class to use the drive functionally
		leftMaster = new CANTalon(1);
		leftSlave = new CANTalon(7);
		rightMaster = new CANTalon(2);
		rightSlave = new CANTalon(8);
		
		//passes CANTAlons to RobotDrive class
		myDrive = new RobotDrive(leftSlave, leftMaster, rightSlave, rightMaster);
		
		
		
	}
	
	@Override
	//launches commands at idle to 
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub runs when robot gets board because you have not told it to do anything
		setDefaultCommand(new OperateJoystick());
		
	}

	public void Arcade (double forward, double turn){
		myDrive.arcadeDrive(forward, turn);
	}
}

