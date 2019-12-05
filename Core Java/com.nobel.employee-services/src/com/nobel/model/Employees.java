
package com.nobel.model;

public class Employees {
	private int id;
	private String name;
	private String location;
	private int salary;
	private String managerName;

	public Employees(int id, String name, String location, int salary,String managerName) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.managerName=managerName;
	}
	public int getSalary() {
		return salary;
	}
	public String giveLocation() {
		return location;
	}
	public void increaseSalaryByPercent() {
		salary=(salary/100*10)+salary;
	}
	public String employeeName() {
		return name;
	}
	public String managerNames() {
		return managerName;
	}
	

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary
				+ ", managerName=" + managerName + "]";
	}

	
}
