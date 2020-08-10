package com.nobelit.assignmetfirst.shape;

public class Sphere extends Shape {

	double radius, height;

	public Sphere(double r, double h) {
		radius = r;
		height = h;
	}

	public double area() {

		double a = 4 * 3.14 * radius * radius;
		return a;
	}

	public double valume() {

		double v = (4.0 / 3.0) * (3.14 * radius * radius * radius);
		return v;
	}

}
