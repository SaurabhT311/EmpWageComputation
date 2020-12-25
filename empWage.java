class empWage
{
	public static final int Max_working_Hrs=100;
	public static final int workday_in_months=20;

        public static void main(String[] args)
        {
		int fullTime=1;
		int partTime=2;
		int wage_per_hr=20;
		int empHrs=0;
		int totalempHrs=0;
		int totalworkingdays=0;

		System.out.println("Welcome to Employee Wage Computation Program in Main branch");
		while(totalempHrs<=Max_working_Hrs && totalworkingdays<=workday_in_months)
		{
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
				case 1:
					empHrs=8;
					break;
				case 2:
					 empHrs=4;
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
			System.out.print("Total Employee Salary is: "+ TotalSalary);
	}
}
