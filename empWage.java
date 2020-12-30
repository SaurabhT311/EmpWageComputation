class empWageSal
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;  
	public static final int Max_working_Hrs=100;
        public static final int workday_in_months=20;

        public void empsalary(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
		int empHrs=0;
		int totalempHrs=0;
		int totalworkingdays=0;

		System.out.println("Welcome to Employee Wage Computation Program in Main branch");
		while(totalempHrs<=max_working_hrs && totalworkingdays<=workday_in_months)
		{
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
				case 1:
					empHrs=8;
					break;
				case 2:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			totalempHrs=totalempHrs+empHrs;
			totalworkingdays++;
		}
			int TotalSalary= totalempHrs*wage_per_hr;
			System.out.println("Total Employee Salary is: "+ TotalSalary);
	}
}

public class empWage
{	
	public static void main(String[] args)
	{
		System.out.println("Welcome To Compute Wage Problrem");
                empWageSal empWage = new empWageSal();
                empWage.empsalary("DeShaw", 25, 20, 100);
		empWage.empsalary("TCS", 50, 20, 100);
		empWage.empsalary("NetScope",20,15,100);
        }
}
