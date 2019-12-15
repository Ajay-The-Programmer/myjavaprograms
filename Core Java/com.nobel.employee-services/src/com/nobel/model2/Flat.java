package com.nobel.model2;
import java.lang.*;
public class Flat implements Comparable<Flat>{
	private String flatName;
	private int rent;
	private int distance;
	private int travelTime;
	private int locationAdvantages;
	private int totalCost;

	public Flat(String flatName, int rent, int distance, int travelTime, int locationAdvantages) {
		super();
		this.flatName = flatName;
		this.rent = rent;
		this.distance = distance;
		this.travelTime = travelTime;
		this.locationAdvantages = locationAdvantages;
	}

	public String getFlatName() {
		return flatName;
	}

	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}

	public int getLocationAdvantages() {
		return locationAdvantages;
	}

	public void setLocationAdvantages(int locationAdvantages) {
		this.locationAdvantages = locationAdvantages;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Flat [flatName=" + flatName + ", rent=" + rent + ", distance=" + distance + ", travelTime=" + travelTime
				+ ", locationAdvantages=" + locationAdvantages + ", totalCost=" + totalCost + "]";
	}
	@Override
	public int compareTo(Flat f2) {
		return this.getTotalCost()-f2.getTotalCost();
		
		
	}

	
	
}
