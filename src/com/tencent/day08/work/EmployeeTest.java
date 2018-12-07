package com.tencent.day08.work;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Worker worker=new Worker();
		worker.setSalary(15000);
		worker.getSalary();
		
		Manager manager=new Manager();
		manager.setSalary(3000);
		manager.getSalary();

	}

}
