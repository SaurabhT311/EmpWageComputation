class empWage
{
        public static void main(String[] args)
        {
		int wage_per_hr=20;
		int fullTime=1;
		int empHrs=0;
      		int partTime=2;
		int salary=0;
		System.out.println("Welcome to the Employee Wage Computation");
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
	}
	salary=empHrs*wage_per_hr;
	System.out.println("Employee Salary: "+ salary);
  }
}
