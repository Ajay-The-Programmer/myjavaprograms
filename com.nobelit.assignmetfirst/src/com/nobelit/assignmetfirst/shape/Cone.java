package com.nobelit.assignmetfirst.shape;

public class Cone extends Shape {

	double height, radius;

	public Cone(double height, double radius) {

		height = height;
		radius = radius;

	}

	public double area() {

		double a = 3.14 * radius * height;
		return a;
	}

	public double valume() {

		double v = (1.0 / 3.0) * (3.14 * radius * radius * height);
		return v;
	}
}
