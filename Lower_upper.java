import java.util.Scanner;
class Lower_upper
{
	public static void main(String args[])
	{
		int i,a,b;
		Scanner sd = new Scanner(System.in);
		System.out.println("enter a lower limit");
		System.out.println("enter a upper limit");
		a=sd.nextInt();
		b=sd.nextInt();
		
		for(i=a;i<=b;i++)
		{
			if(i%2==0)
			{
			System.out.println("even no="+i);
			}
		}
	}
}
