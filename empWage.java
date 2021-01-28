class empWage
{
	public static final int IS_Full_Time=1;
	public static final int IS_Part_Time=2;  
	public static final int MAX_WORKING_HRS=100;
        public static final int WORKDAY_IN_MONTHS=20;
	public static final int WAGE_PER_HR=20;	

        public static void empSalary()
        {
		int empHrs=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;

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
			int TotalSalary= totalEmpHrs*WAGE_PER_HR;
			System.out.println("Total Employee Salary is: "+ TotalSalary);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome To Compute Wage Problrem");
		empSalary();
        }
}
