import java.util.Scanner;
class Odd_forloop
{
	public static void main(String args[])
	{
		int i,a,b,s=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter The lower limit");
		System.out.println("Enter The Upper limit");
		a=sd.nextInt();
		b=sd.nextInt();
		
		for(i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				s=s+i;
			}
		}
				System.out.println("sum od odd no.="+s);
	}
}
		
		
		