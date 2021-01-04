import java.util.ArrayList;
class companyEmpWage
{
        //instance variables  
        public String company;
        public int wage_per_hr;
        public int workday_in_months;
        public int max_working_hrs;
        public int totalSalary;
        ArrayList<Integer>dailyWage=new ArrayList<Integer>();

        //parameterized constructor
        public companyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
                this.company= company;
                this.wage_per_hr= wage_per_hr;
                this.workday_in_months= workday_in_months;
                this.max_working_hrs= max_working_hrs;            
        }
        //is used to replace the element at the specified position in the list with the specified element
        public void setTotalSalary(int totalSalary)
        {
                this.totalSalary=totalSalary;
        }
        public String toString() //to return desire output 
        {
              return "Total employee wage for: " +company+ " is " +totalSalary+"\n";
        }
        	
}
//implementing interface
public class empWage
{
        public static final int isFullTime=1;
        public static final int isPartTime=2;
        int dailysal;
        ArrayList<Integer>dailyWage=new ArrayList<Integer>();//created arraylist for dailywage
        public ArrayList<companyEmpWage> companyEmpWageArray;//created arraylist
        public empWage()//default construcor
        {
                companyEmpWageArray=new ArrayList<>();
        }
        //function to add daily salary into arraylist
        public void dailyWage()
        {
            dailyWage.add(dailysal);
        }
        //Adding companies in arrays
        public void addCompanyEmpWage(String company, int wage_per_hr, int workday_in_months, int max_working_hrs)
        {
                companyEmpWage companylist=new companyEmpWage(company, wage_per_hr, workday_in_months, max_working_hrs);
                companyEmpWageArray.add(companylist);
        }
        //calling computewage function and calculating empwage for every index
        public void computeEmpWage()
        {
                for(int i=0;i<companyEmpWageArray.size();i++)
                {
                        companyEmpWage companylist=companyEmpWageArray.get(i);//created object and getting companies with index position.
                        companylist.setTotalSalary(this.computeWage(companylist));
                        System.out.println(companylist);
                }
        }

        //function to calculate salary for  employee
        private int computeWage(companyEmpWage companylist)
        {
                //local variables
                int empHrs=0;
                int totalempHrs=0;
                int totalworkingdays=0;

                //loop will run untill it reaches 100 hours or 20 days
                while(totalempHrs<=companylist.max_working_hrs && totalworkingdays<=companylist.workday_in_months)
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
                        //calculating dailywage for employee
                         dailysal=empHrs*companylist.wage_per_hr;
				        companylist.dailyWage.add(dailysal);
				        
                        //adding hours in total hours as totalemp hours is 0
                        totalempHrs=totalempHrs+empHrs;
                        totalworkingdays++; //incrementing while loop.
                }
                    //Printing dailyWage for every employee
                    System.out.println("DailyWage for employee is: "+companylist.dailyWage);
                    
                    //Calculating total salary of employee
                        int totalSalary= totalempHrs*companylist.wage_per_hr; 
                        return totalSalary;
        }

        //main method
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program in Main branch \n");
                empWage ob=new empWage();//created object for empWage class
                ob.addCompanyEmpWage("DeSaw",50,35,25);//calling funtion with the object
                ob.addCompanyEmpWage("TCS",40,25,18);//calling function with the object
                ob.addCompanyEmpWage("NetScope",50,20,15);//doing same like above two
                ob.computeEmpWage();//calling fucntion with the object
        }
}
