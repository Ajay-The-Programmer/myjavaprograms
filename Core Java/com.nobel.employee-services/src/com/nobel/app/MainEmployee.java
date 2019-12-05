
package com.nobel.app;

import com.nobel.service.EmployeeServices;
import com.nobel.service.given;
import com.nobel.service.greater;
import com.nobel.service.salary;

import java.util.ArrayList;
import java.util.List;
import com.nobel.model.Employees;

public class MainEmployee {

	public static void main(String[] args) {

		EmployeeServices service = new EmployeeServices();

		service.addEmployee(new Employees(1, "Sunil", "Pune", 50000, "Satis"));
		service.addEmployee(new Employees(2, "Ajay", "Mumbai", 90000, "Anand"));
		service.addEmployee(new Employees(3, "Anand", "pune", 60000, "Pratik"));
		service.addEmployee(new Employees(4, "Pratik", "pune", 30000, "Raju"));
		
		System.out.println("\n*************Print all Employee Information*****************");
		List<Employees> list = service.getAllEmployee();
		for (Employees employee : list) {
			System.out.println(employee);
		}

		
		System.out.println("\n**************Salary is greater than 50000****************\n");
		list = service.greaterSalary(50000);
		for (Employees employee : list) {
			System.out.println(employee);
		}

		
		System.out.println("\n************Salary between 40,000 to 70,000 *******************\n");
		list = service.BetweenSalary(40000, 70000);
		for (Employees employee : list) {
			System.out.println(employee);
		}
		
	
		System.out.println("\n**************Emloyees by given location*******************\n");
		list=service.givenLocation("pune");
		for(Employees employee : list) {
			System.out.println(employee);
		}
		
		
		
		System.out.println("\n**************Updated salary by 10% whose location is Pune**************\n");
		list=service.increaseSalary("pune");
		for(Employees employee: list) {
			System.out.println(employee);
		}
		
		
		
//		
//		System.out.println("**************	5. Employees whose manager's salary is greater than given value.*************");
//		list=service.employeeIsGreaterThanManagerSalary(){
//			for(Employees employee:list) {
//				System.out.println(list);
//			}
//			
//		}
//		
		
		
		
	}
}
