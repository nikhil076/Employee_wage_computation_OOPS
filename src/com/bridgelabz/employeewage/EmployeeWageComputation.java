package com.bridgelabz.employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome  to Employeee wage computation program");
		checkPresentOrAbsent();
	}
	public static boolean checkPresentOrAbsent() 
	{
		double random = Math.floor(Math.random()*10)%2;
		if(random==1)
		{
			System.out.println("Employee is present");
			return true;
		}
		else
			System.out.println("Employee is absent");
			return false;
	}
}
