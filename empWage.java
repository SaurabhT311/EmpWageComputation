class empWage
{
        public static void main(String[] args)
        {
		int wage_per_hr=20;
		int fulltime=8;
		int empHrs=0;
      		int isPresent=1;
		System.out.println("Welcome to the Employee Wage Computation");
		int empCheck=(int)(Math.floor(Math.random()*10)%2);
		if(empCheck==isPresent)
		{
			System.out.println("Employee is present");
			int dailyWage=fulltime*wage_per_hr;
			System.out.println("Employee daily wage is :"+dailyWage);
	        }
		else{
			System.out.println("Employee is Absent");
		}
	}
  }

