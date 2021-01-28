class empWage
{
	public static final int MAX_WORKING_HRS=100;
	public static final int WORKDAY_IN_MONTHS=20;

        public static void main(String[] args)
        {
		int fullTime=1;
		int partTime=2;
		int wage_per_hr=20;
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		System.out.println("Welcome to Employee Wage Computation Program in Main branch");
		while(totalEmpHrs<=MAX_WORKING_HRS && totalWorkingDays<=WORKDAY_IN_MONTHS)
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
			totalEmpHrs=totalEmpHrs+empHrs;
			totalWorkingDays++;
		}
			int TotalSalary= totalEmpHrs*wage_per_hr;
			System.out.print("Total Employee Salary is: "+ TotalSalary);
	}
}
