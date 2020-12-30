class empWage
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;  
	public static final int max_working_Hrs=100;
        public static final int workday_in_months=20;
	public static final int wage_per_hr=20;	

        public static void empsalary()
        {
		int empHrs=0;
		int totalworkingdays=0;
		int totalempHrs=0;

		while(totalempHrs<=max_working_Hrs && totalworkingdays<=workday_in_months)
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
	public static void main(String[] args)
	{
		System.out.println("Welcome To Compute Wage Problrem");
		empsalary();
        }
}
