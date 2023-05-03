import java.util.Scanner;
class Prime_forloop
{
	public static void main(String args[])
	{
		int i,n=1,c=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("enter a no");
		
		n=sd.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime no");
			
		}
		else
		{
			System.out.println("not a prime no");
		}
	}
}
		