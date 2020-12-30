class empWage
{
        //instance variables
        public static final int isFullTime=1;
        public static final int isPartTime=2;

        //fucntion to compute monthly salary
        public static void computeWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
		//local variables
                int empHrs=0;
                int totalempHrs=0;
                int totalworkingdays=0;

                //loop will run untill it reaches 100 hours or 20 days
                while(totalempHrs<=max_working_hrs && totalworkingdays<=workday_in_months)
                {
                        //switch case to check for fulltime or parttime
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
                        //adding hours in total hours as totalemp hours is 0
                        totalempHrs=totalempHrs+empHrs;
                        totalworkingdays++; //incrementing while loop.
                }
                        int TotalSalary= totalempHrs*wage_per_hr; //Calculating total salary
		
			//printing totalsalary of different companies employee
                        System.out.println( "Total Employee Salary of " + company +" is " + TotalSalary);
        }
        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch");
                computeWage("DeShaw", 25, 20, 100);//calling funtion and passing arguments
                computeWage("TCS", 50, 20, 100);//calling function and passing argument
                computeWage("NetScope",20,15,100);//doing same like above two
        }
}
