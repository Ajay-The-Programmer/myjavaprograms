package com.nobel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.model.Plane;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Plane plane = context.getBean("plane",Plane.class);
		
		try {
			plane.fly();
			
			Thread.sleep(2000);
			
			plane.takeOff();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
