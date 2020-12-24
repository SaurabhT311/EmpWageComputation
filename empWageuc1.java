class empWageuc1
{
	public static void main(String[] args)
	{
		int isPresent=1;
		int res=(int)((Math.random()*10)%2);
		if(res==isPresent)
		{
			System.out.print("Employee is present");
		}else{
			System.out.print("Employee is absent");
		}
	}
}
