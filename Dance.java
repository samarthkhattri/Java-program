import java.util.Scanner;
class Dance
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sd = new Scanner(System.in);
		System.out.println("enter first number");		
		a=sd.nextInt();
		System.out.println("enter second number");
		b=sd.nextInt();
		System.out.println("enter third number");
		c=sd.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("largest is first number:"+a);
		}
		else if(b>c)
		{
			System.out.println("largest is second number:"+b);
		}
		else
		{
			System.out.println("largest is third number:"+c);
		}	
	}
	
}	