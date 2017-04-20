package com.tdb.hop.simulation;


import com.tdb.hop.simulation.sensors.OxygenSensor;
import com.tdb.hop.simulation.sensors.PhSensor;
import com.tdb.hop.simulation.sensors.TemperatureSensor;

// Collect data for sending back to the Collector.

public class Microcontroller { 
	
	private Environment environment;
	private OxygenSensor oxygenSensor;
	private PhSensor phSensor;
	private TemperatureSensor temperatureSensor;
	
	private int temperature;
	private double ph;
	private double oxygen;
	private double oxygenVoltage;
	
	public Microcontroller(Environment environment)
	{
		this.environment = environment;
		this.oxygenSensor = new OxygenSensor(this.environment);
		this.phSensor = new PhSensor(this.environment);
		this.temperatureSensor = new TemperatureSensor(this.environment);
		
		// Preload data
		this.pollSensors();
		
		this.pollLoop();
	}
	
	private void pollLoop();
	{
		while(exit)
	}
	
	private void pollSensors()
	{
		this.ph = phSensor.pollPhSensor();
		this.oxygenVoltage = oxygenSensor.pollOxygenSensor();
		this.temperature = temperatureSensor.pollTemperature();
		this.processOxygenVoltage();
	}
	
	
	private void processOxygenVoltage()
	{
		this.oxygen = this.oxygenVoltage / 2.87;
	}
}
