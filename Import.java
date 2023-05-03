import java.util.Scanner;
class Import
{
	public static void main(String args[])
	{
		int a;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		a=sd.nextInt();
		
		if(a>=1000000 && a<=9999999)
		{	
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("ODD");
		}
	}
}	