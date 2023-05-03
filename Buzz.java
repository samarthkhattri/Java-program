import java.util.Scanner;
class Buzz
{
	public static void main(String args[])
	{
		int n,m=0;
		Scanner sv = new Scanner(System.in);
		System.out.println("enter the integer:");
		
        n = sv.nextInt();
		
		if(n%7==0 || m%10==0)
		{	
		   System.out.println("is a buzz no."+n);
		}
		else
		{
			System.out.println("not a buzz no."+m);
		}	
	}
}	
		
	