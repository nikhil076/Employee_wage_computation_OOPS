package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	static final int wagePerHour = 20;
	static final int fullDayHour = 8;
	static final int isFullDayPresent = 1;
	static final int isparTimePresent = 2;
	static final int partTimeHour = 4;
	static final int workingDayPerMonth = 20;
	public static void main(String[] args) {
		System.out.println("Welcome  to Employeee wage computation program");
		switch (checkPresentOrAbsent(isFullDayPresent, isparTimePresent)) {
		case isFullDayPresent: {
			
			calculateFullDayEmployeeWage();
			break;
		}
		case isparTimePresent: {
			
			calculatePartTimeEmployeeWage();
			break;
		}
		default:
			System.out.println("Employee is Absent");
		}
	}
	public static int checkPresentOrAbsent(int fullDay, int partTime) 
	{
		double random = Math.floor(Math.random()*10)%3;
		if(random==fullDay)
		{
			System.out.println("Employee is present for full day");
			return fullDay;
		}
		else if (random == partTime) {
			System.out.println("Employee is part time present");
			return partTime;
		}
		return 0;
	}
	public static void calculateFullDayEmployeeWage() 
	{
		int fullDayDailyWage = wagePerHour * fullDayHour;
		System.out.println("Employee daily wage for full day is :"+fullDayDailyWage);
		int fullDayMonthlyWage = fullDayDailyWage * workingDayPerMonth;
		System.out.println("Employee monthly wage for full day is :"+fullDayMonthlyWage);
	}
	public static void calculatePartTimeEmployeeWage() {
		int partTimeDailyWage = wagePerHour * partTimeHour;
		System.out.println("Employee daily wage for part time is "+partTimeDailyWage);
		int partTimeMonthlyWage = partTimeDailyWage * workingDayPerMonth;
		System.out.println("Employee monthly wage for part time is :"+partTimeMonthlyWage);
	}
}
