package com.tdb.hop.simulation;

// Simulate the environment

public class Environment {

	private int temperature;
	private double oxygen;
	private double ph;
	
	public Environment()
	{
		this.temperature = 24;
		this.oxygen = 17.3;
		this.ph = 6.3;
	}
	
	public double getOxygen()
	{
		return this.oxygen;
	}
	
	
	public double getPh()
	{
		return this.ph;
	}
	
	public int getTemperature()
	{
		return this.temperature;
	}
	
	public void increaseOxygen()
	{
		this.oxygen = this.oxygen + 0.1;
	}
	
	public void decreaseOxygen()
	{
		this.oxygen = this.oxygen - 0.1;
	}
	
	public void increasePh()
	{
		this.ph = this.ph + 0.1;
	}
	
	public void decreasePh()
	{
		this.ph = this.ph - 0.1;
	}
	
	public void increaseTemperature()
	{
		this.temperature = this.temperature + 2;
	}
	
	public void decreaseTemperature()
	{
		this.temperature = this.temperature - 2;
	}
	
	public void reset()
	{
		this.temperature = 24;
		this.oxygen = 17.3;
		this.ph = 6.3;
	}
	
}
