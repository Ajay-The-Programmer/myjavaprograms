package com.nobelit.assignmetfirst.main;

import com.nobelit.assignmetfirst.shape.Cone;
import com.nobelit.assignmetfirst.shape.Cylinder;
import com.nobelit.assignmetfirst.shape.Shape;
import com.nobelit.assignmetfirst.shape.Sphere;

public class CalculateShape {
	public static void main(String[] args) {

		Shape sphere, cone, shape, cylinder;

		sphere = new Sphere(4, 5);
		System.out.println("Area of Sphere " + sphere.area());
		System.out.println("Valuem of Sphere" + sphere.valume());

		cone = new Cone(4, 4);
		System.out.println("Area of Sphere " + cone.area());
		System.out.println("Valuem of Sphere" + cone.valume());

		cylinder = new Cylinder(1, 2);
		System.out.println("Area of Sphere " + cylinder.area());
		System.out.println("Valuem of Sphere" + cylinder.valume());

	}

}
