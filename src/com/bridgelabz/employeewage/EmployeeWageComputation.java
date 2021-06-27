package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	static final int wagePerHour = 20;
	static final int fullDayHour = 8;
	public static void main(String[] args) {
		System.out.println("Welcome  to Employeee wage computation program");
		if(checkPresentOrAbsent()==true)
		{
			CalculateEmployeeWage();
		}
		else
			System.out.println("Employee is absent");
	}
	public static boolean checkPresentOrAbsent() 
	{
		double random = Math.floor(Math.random()*10)%2;
		if(random==1)
		{
			System.out.println("Employee is present");
			return true;
		}
		return false;
	}
	public static void CalculateEmployeeWage() 
	{
		int fullDayDailyWage = wagePerHour * fullDayHour;
		System.out.println("Employee daily wage for full day is :"+fullDayDailyWage);
	}
}
