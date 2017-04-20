package com.tdb.hop.simulation.sensors;

import com.tdb.hop.simulation.Environment;
// Oxygen sensors generally operate by outputting a voltage.  We need a function that can output a voltage between 0 - 60ish mv.  
// Temperature will affect the output of the oxygen sensor 

// Attempting to simulate this oxygen sensor: http://www.ictinternational.com/products/icto2/icto2-soil-oxygen-sensor/

public class OxygenSensor
{
	
	private double oxygenPercentage;
	private double voltageOutput;
	private int temperature;
	private Environment environment;
	
	public OxygenSensor(Environment environment)
	{
		this.environment = environment;
	}
	
	public double pollOxygenSensor()
	{
		// Read environmental oxygen percentage
		this.readEnvironment();
		// Calculate oxygen percentage
		this.calculateVoltage();
		return this.voltageOutput;	
	}
	
	// Use this to read the environmental information.  Simulate reading the actual sensor
	private void readEnvironment()
	{
		this.oxygenPercentage = environment.getOxygen();
	}
	
	// Use the output of the temperature to modify the voltage output
	private void calculateVoltage()
	{
		this.voltageOutput = 287.36 * (this.oxygenPercentage / 100);		
	}
}
