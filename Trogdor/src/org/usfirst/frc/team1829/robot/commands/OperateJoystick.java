package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class OperateJoystick extends Command{
	private Joystick myJoystick;
	//constructor for command instance
	public OperateJoystick() {
	requires (Robot.getcurrentDrive());
	myJoystick = new Joystick(0);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub runs when instantiated
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub runs like while loop until killed
		Robot.getcurrentDrive().Arcade(myJoystick.getY(), myJoystick.getX());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub runs to inform status of current command running and returns status
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub updates when isFinished function returns true
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub runs when command is killed instead of returning true from isFinished
		
	}

}
