import java.util.*; 
public class EmployeeDailyWageUC2 {

	public static int findSalary()
	{
	int isPresent = 1;
		int wagePerHour = 20;
		int empHrs=8;
		double empCheck = Math.floor(Math.random() * 10)%2;         
		if (empCheck == isPresent)
			return (wagePerHour * empHrs);
		else
			return 0;	
	
	}

	public static void main(String[] args) {
		
		System.out.println("salary is "+findSalary());
		}
}
