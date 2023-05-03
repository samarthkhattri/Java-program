import java.util.Scanner;
class Week
{
	public static void main(String args[])
	{
		int a;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the value");
		
		a=sd.nextInt();
		
		if(a==1)
		 System.out.println("SUNDAY");
	    else if(a==2)
		 System.out.println("MONDAY");
		else if(a==3)
		 System.out.println("TUESDAY");
	    else if(a==4)
		 System.out.println("WEDNESDAY");
		else if(a==5)
		 System.out.println("THURSDAY");
	    else if(a==6)
			System.out.println("FRIDAY");
	    else if(a==7)
			System.out.println("SATURADAY");
	   
	    else
		  System.out.println("invalid input");
	}
}	
		
		