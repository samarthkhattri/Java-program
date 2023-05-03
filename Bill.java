import java.util.Scanner;
class Bill
{
	public static void main(String args[])
	{
		double n,f;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER ENERGY CONSUMED");
		
		n=sd.nextDouble();
		
		if (n>100)
		{
			f=n*2.00d+200;
			System.out.println("CHARGE:-"+f);
		}
		else if (n>=101 && n<=200)
		{
			f=n*1.78d+200;
			System.out.println("CHARGE:-"+f);
		}
		else if (n>=201 && n<=300)
		{
			f=n*1.85d+200;
			System.out.println("CHARGE:-"+f);
		}
	}
}	
		
		
	