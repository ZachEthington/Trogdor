package org.usfirst.frc.team1829.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Collector extends Subsystem {

	private CANTalon motor;
	private DigitalInput opticalSensor;
	
	public Collector(){
		motor = new CANTalon(6);
		opticalSensor = new DigitalInput(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	//set collector motor speed
	public void set(double speed){
	
	motor.set(speed);
	}
	//if sensor reads true we have the ball, otherwise it does not
	public boolean hasBall() {
		
		return opticalSensor.get();
	}
}
