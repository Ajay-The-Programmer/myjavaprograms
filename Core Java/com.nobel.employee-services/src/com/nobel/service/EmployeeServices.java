
package com.nobel.service;

import com.nobel.model.Employees;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeServices {

	private List<Employees> list = new ArrayList<>();

	public void addEmployee(Employees employee) {
		list.add(employee);

	}

	public List<Employees> greaterSalary(int salary) {
		List<Employees> getGreaterSalary = new ArrayList<>();

		for (Employees employee : list) {
			if (employee.getSalary() > salary) {
				getGreaterSalary.add(employee);
			}

		}
		return getGreaterSalary;
	}

	public List<Employees> getAllEmployee() {

		return list;
	}

	public List<Employees> BetweenSalary(int lessSalary, int maxSalary) {
		List<Employees> betweensalary = new ArrayList<>();

		for (Employees employee : list) {
			int salary = employee.getSalary();
			if (salary > lessSalary && salary < maxSalary) {
				betweensalary.add(employee);
			}
		}
		return betweensalary;
	}

	public List<Employees> givenLocation(String location) {
		List<Employees> givenLoc = new ArrayList<>();
		for (Employees employee : list) {
			if (employee.giveLocation() == location) {
				givenLoc.add(employee);

			}
		}
		for (Employees employee : list) {
			if (employee.giveLocation() != location) {
				givenLoc.add(employee);
			}
		}
		return givenLoc;
	}

	public List<Employees> increaseSalary(String location) {
		List<Employees> incriSalary = new ArrayList<>();
		for (Employees employee : list) {
			if (employee.giveLocation().equalsIgnoreCase(location)) {
				employee.increaseSalaryByPercent();
				incriSalary.add(employee);
			} 
	

		}
		return incriSalary;

	}
	
	
	public List<Employees> employeeIsGreaterThanManagerSalary() {
		List<Employees> employeeIsGreater=new ArrayList<>();
		
		for(Employees employee:list) {
			String name=employee.employeeName();
			String	
			
			
			for(Employees employee:list) {
				
			}
			
			
		}
		return null;
}

	
	
	
	5. Employees whose manager's salary is greater than given value

	1,Sunil,Pune,50000,Anil
	2,Anil,Mumbai,70000,Satish
	3,Satish,Pune,90000,Anand
	4,Anand,Pune,100000,Arvind



}
