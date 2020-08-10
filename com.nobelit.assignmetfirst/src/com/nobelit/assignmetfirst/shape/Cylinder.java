package com.nobelit.assignmetfirst.shape;

public class Cylinder extends Shape {

	double height, radius;

	public Cylinder(double height, double radius) {

		this.height = height;
		this.radius = radius;

	}

	public double area() {

		double a = (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
		return a;
	}

	public double valume() {

		double v = (3.14 * radius * radius * height);
		return v;
	}

}
