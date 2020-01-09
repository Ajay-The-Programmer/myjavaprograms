package com.nobel.model;

public class JetEngine implements Engine {

	public String fuel;
	
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	

	public JetEngine() {
		super();
	}

	@Override
	public void engineStart() {
		
		System.out.println("Engin is Started..............");
		
		
		
	}

	@Override
	public void engineStop() {
		
		System.out.println("Engine is Stoped.............");
	}

	@Override
	public String toString() {
		return "fuel=" + fuel + "]";
	}

}
