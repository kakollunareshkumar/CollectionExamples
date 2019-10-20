package com;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee(1,"Jai",50000));
		hashSet.add(new Employee(2,"Mahesh",80000));
		hashSet.add(new Employee(3,"Vishal",60000));
		hashSet.add(new Employee(4,"Hemant",64000));
		for(Employee e:hashSet){
			System.out.println(e);
		}
		System.out.println("Add duplicate record:");
		hashSet.add(new Employee(3,"Vishal",60000));
		for(Employee e:hashSet){
			System.out.println(e);
		}
	}
}
