package com.cts.dsa.util.maps.sets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTest {
	public static void main(String[] args) {
		Employee first  = new Employee("Dilip", 30000);
		Employee second = new Employee("Kiran", 50000);
		Employee third  = new Employee("Gopal", 70000);
		Employee fourth = new Employee("Kiran", 50000);
		Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
		employees.put(first.hashCode(), first);
		employees.put(second.hashCode(), second);
		employees.put(third.hashCode(), third);
		employees.put(first.hashCode(), fourth);
		Set<Map.Entry<Integer, Employee>> entries = employees.entrySet();
		entries.forEach(entry -> System.out.println("[key:" + String.format("%X", entry.getKey()) + ", value: " + entry.getValue() + "]"));
		System.out.println();
	}
}