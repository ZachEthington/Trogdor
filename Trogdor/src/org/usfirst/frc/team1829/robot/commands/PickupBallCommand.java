package org.usfirst.frc.team1829.robot.commands;

import org.usfirst.frc.team1829.robot.Robot;
import org.usfirst.frc.team1829.robot.subsystems.Collector;

import edu.wpi.first.wpilibj.command.Command;

public class PickupBallCommand extends Command {
	
	private Collector myCollector;
	
	public PickupBallCommand() {
		requires(myCollector = Robot.getCollector());
		
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//turns on collector, assume positive sucks in
		myCollector.set(0.5);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return myCollector.hasBall();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		myCollector.set(0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
