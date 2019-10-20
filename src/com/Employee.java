package com;

public class Employee {

	private String name;
	private int salary;
	private int id;


	public Employee(int salary, String name, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int hashCode(){
		System.out.println("In hashcode");
		return this.getId();
	}

	public boolean equals(Object obj){
	Employee e=null;
	if(obj instanceof Employee){
		e=(Employee)obj;
	}
		System.out.println("In equals method");

	if(this.getId()==e.getId()){
		return  true;
	}
	else{
		return  false;
	}
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				", id=" + id +
				'}';
	}
}
