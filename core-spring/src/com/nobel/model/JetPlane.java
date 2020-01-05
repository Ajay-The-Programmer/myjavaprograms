package com.nobel.model;

import java.util.List;

public class JetPlane  implements Plane{
	
	
	public Engine engine;
	
	List<Passenger> passenger;
	

	public List<Passenger> getPassenger() {
	
		return passenger;
	
	}


	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}




	public JetPlane() {
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public void fly() {
		
		System.out.println("Passenger is:-" +passenger);
		
		engine.engineStart();
		
		
		System.out.println("plane flying..............");
		
		
		
	}

	@Override
	public void takeOff() {
		
		System.out.println("plane TakeOff.................");
		
		engine.engineStop();
	}


	@Override
	public String toString() {
		return "JetPlane [engine=" + engine + ", passenger=" + passenger + "]";
	}
	
	
}
