package com.tdb.hop.simulation.sensors;

import com.tdb.hop.simulation.Environment;

public class TemperatureSensor {

	private int Temperature;
	private Environment environment;
	
	public TemperatureSensor(Environment environment)
	{
		this.environment = environment;
	}
	
	
	public int pollTemperature()
	{
		this.readEnvironment();
		return this.Temperature;
	}
	
	public void readEnvironment()
	{
		this.Temperature = this.environment.getTemperature();
	}
	
	
}
