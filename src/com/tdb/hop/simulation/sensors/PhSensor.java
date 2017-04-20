package com.tdb.hop.simulation.sensors;

import com.tdb.hop.simulation.Environment;


public class PhSensor {

	private double phLevel;
	private Environment environment;
	
	public PhSensor(Environment environment)
	{
		this.environment = environment;
	}	

	public double pollPhSensor()
	{
		this.readEnvironment();
		return this.phLevel;
	}
	
	private void readEnvironment()
	{
		this.phLevel = this.environment.getPh();
	}
	
}
