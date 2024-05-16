package com.cts.dsa.util.maps.sets;

import java.util.Iterator;
import java.util.Map.Entry;

public class SortedMapTest {
	public static void main(String[] args) {
		SortedMap<Integer, Employee> employeesWithIds = new SortedMap<Integer, Employee>();
		employeesWithIds.put(12, new Employee("Dilip", 30000));
		employeesWithIds.put(6, new Employee("Kiran", 50000));
		employeesWithIds.put(15, new Employee("Gopal", 75000));
		employeesWithIds.put(3, new Employee("Bharath", 50000));
		
		System.out.println("Employees in the list:");
		Iterator<Entry<Integer, Employee>> iteratorIds = employeesWithIds.iterator();
		while(iteratorIds.hasNext()) {
			MapEntry<Integer, Employee> map = (MapEntry<Integer, Employee>) iteratorIds.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}
		System.out.println();
		
		SortedMap<String, Employee> employeesWithLabels = new SortedMap<String, Employee>();
		employeesWithLabels.put("alpha", new Employee("Dilip", 30000));
		employeesWithLabels.put("john", new Employee("Kiran", 50000));
		employeesWithLabels.put("joe", new Employee("Gopal", 75000));
		employeesWithLabels.put("theta", new Employee("Bharath", 50000));
		employeesWithLabels.put("beta", new Employee("Raj", 35000));
		employeesWithLabels.put("gama", new Employee("Rahul", 70000));
		
		System.out.println("Employees in the list:");
		Iterator<Entry<String, Employee>> iteratorLabels = employeesWithLabels.iterator();
		while(iteratorLabels.hasNext()) {
			MapEntry<String, Employee> map = (MapEntry<String, Employee>) iteratorLabels.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}
		System.out.println();

		SortedMap<Integer, Employee> employeesWithHashCodes = new SortedMap<Integer, Employee>();
		Employee employee = new Employee("Dilip", 30000);
		employeesWithHashCodes.put(employee.hashCode(), employee);
		employee = new Employee("Kiran", 50000);
		employeesWithHashCodes.put(employee.hashCode(), employee);
		employee = new Employee("Gopal", 75000);
		employeesWithHashCodes.put(employee.hashCode(), employee);
		employee = new Employee("Bharath", 50000);
		employeesWithHashCodes.put(employee.hashCode(), employee);
		
		System.out.println("Employees in the list:");
		Iterator<Entry<Integer, Employee>> iteratorHashcode = employeesWithHashCodes.iterator();
		while(iteratorHashcode.hasNext()) {
			MapEntry<Integer, Employee> map = (MapEntry<Integer, Employee>) iteratorHashcode.next();
			System.out.println(String.format("%X", map.getKey()) + ": " + map.getValue());
		}
		System.out.println();

		SortedMap<String, Double> peopleWithHeights = new SortedMap<String, Double>();
		peopleWithHeights.put("kishore", 5.1);
		peopleWithHeights.put("zeena", 5.5);
		peopleWithHeights.put("ashok", 6.3);
		peopleWithHeights.put("kiran", 6.5);

		System.out.println("People in the list:");
		Iterator<Entry<String, Double>> iteratorPeople = peopleWithHeights.iterator();
		while(iteratorPeople.hasNext()) {
			MapEntry<String, Double> map = (MapEntry<String, Double>) iteratorPeople.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}
		System.out.println();
		
		SortedMap<Employee, String> employeesWithObjects = new SortedMap<Employee, String>();
		employee = new Employee("Dilip", 30000);
		employeesWithObjects.put(employee, "Trainer");
		employeesWithObjects.put(employee, "Counseller");
		employee = new Employee("Kiran", 50000);
		employeesWithObjects.put(employee, "Admin");
		employee = new Employee("Dilip", 30000);
		employeesWithObjects.put(employee, "HR");
		
		System.out.println("Employees in the list:");
		Iterator<Entry<Employee, String>> iteratorObjects = employeesWithObjects.iterator();
		while(iteratorObjects.hasNext()) {
			MapEntry<Employee, String> map = (MapEntry<Employee, String>) iteratorObjects.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}
		System.out.println();
	}
}