import java.util.*; 
public class PartTimeEmployeeWageUC3 {
		public static final int isFullTime = 1;
		public static final int isPartTime = 2;
	public static int findSalary()
		{
		int wagePerHour = 20;
		int empHrs;
		int empCheck = (int)Math.floor(Math.random() * 10)%3;         
		if (empCheck == isFullTime)
			empHrs = 8;		
		else if (empCheck == isPartTime)
			empHrs = 4;
		else
			empHrs=0;
		return wagePerHour * empHrs;	
		
		}
	public static void main(String[] args) {
		System.out.println("salary is "+findSalary());
		}
}
