package Java;
//Write a code to calculate salary of an employee
//Salary should be disbursed on weekly pay and it should also deduct the vacation days
public class SalaryCalculatorAssestment {
public static double EmployeeSalary(double hoursPerWeek, double amountPerHour, double vacationDays) {
	if (hoursPerWeek < 0 || amountPerHour < 0)  {
		return 0;
	}
	double weeklyPayCheck = hoursPerWeek * amountPerHour;
	double unpaidTime = vacationDays * 8 * amountPerHour;
	return weeklyPayCheck * 52 - unpaidTime;
}
	public static void main(String[] args) {
		double salary = EmployeeSalary(40, 15, 8);
		System.out.println(salary);
	}
}
