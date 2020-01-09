package com.nobel.model;

public class JetPlane  implements Plane{
	
	
	public Engine engine;
	
	/*
	 * List<Passenger> passenger;
	 * 
	 * 
	 * public List<Passenger> getPassenger() {
	 * 
	 * return passenger;
	 * 
	 * }
	 * 
	 * 
	 * public void setPassenger(List<Passenger> passenger) { this.passenger =
	 * passenger; }
	 * 
	 */

	
	public void setupInstructions() {
		System.out.println("Set Up Instructions............");
	}
	
	


	public JetPlane() {
		super();
	}



	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public void fly() {
		
		
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
		return "JetPlane [engine=" + engine + "]";
	}
	
	public void removeAllSeatBelts() {
		System.out.println("removed seat belt");
	}
	
}
