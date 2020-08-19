package mainfunction;

import factory.FactoryPattern;
import singlton.SingletonPattern;

public class MainFunction {

	public static void main(String[] args) {

		// FactoryPattern obj=new FactoryPattern(); //we can't creat obj of that class
		// which constructore is private

		FactoryPattern objF = FactoryPattern.getObject();
		FactoryPattern objF1 = FactoryPattern.getObject();

		//Create different obj of factory class
		
		System.out.println("object of FactoryPattern " + objF);
		System.out.println("object of FactoryPattern  " + objF1);

		
		
		
		SingletonPattern objS = SingletonPattern.getObject();
		SingletonPattern objS1 = SingletonPattern.getObject();

		 //create only one object of singleton class
		
		System.out.println("object of SingletonPattern " + objS);
		System.out.println("object of SingletonPattern " + objS1);

	}

}
