package com.cts.dsa.util.maps.sets;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class Employee {
	private static int lastId = 0;
	
	private long id;
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.id = ++lastId;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {}
	
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }
	
	@Override public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override public boolean equals(Object object) { return super.equals(object); }

	@Override public int hashCode() { 
		int answer = -1;
		try {
			answer = new BigInteger(getSHA(this.toString())).intValue();
		} catch(NoSuchAlgorithmException nsae) {}
		return answer;
	}
	
	private byte[] getSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		return messageDigest.digest(input.getBytes());
	}
}