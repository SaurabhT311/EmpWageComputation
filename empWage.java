class empWage
{
        public static void main(String[] args)
        {
		int wage_per_hr=20;
		int fullTime=1;
		int empHrs=0;
      		int partTime=2;
		int salary=0;
		int workday_in_month=20;
		int TotalSalary=0;
		for(int i=1;i<=workday_in_month;i++)
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
			salary=empHrs*wage_per_hr;
			TotalSalary= salary+ TotalSalary;
		}
		System.out.println("Employee Salary in a month: "+ TotalSalary);
  }
}
