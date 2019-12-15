package com.nobel.Flatservices;

import java.util.List;
import com.nobel.model2.Flat;

public class FlatCostCalculatorService {

	private List<Flat> flats;

	public FlatCostCalculatorService(List<Flat> flats) {
		super();
		this.flats = flats;
	}

	public void calculateTotalCost() {
		int totalCost = 0;
		for (Flat flat : flats) {
			totalCost = flat.getRent();
			totalCost += (flat.getDistance() * 10) * 20;
			totalCost += (flat.getTravelTime() * 5) * 20;
			totalCost -= flat.getLocationAdvantages();
			flat.setTotalCost(totalCost);
		}
	}

}