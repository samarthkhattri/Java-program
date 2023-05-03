import java.util.Scanner;
class PRIME_NO_DOWHILE
{
	public static void main(String args[])
	{
		int n,i=1,c=0;
		
		Scanner sd = new Scanner(System.in);
		System.out.println("enter a no.");
		
		n=sd.nextInt();
		
		do
		{
			if(n%i==0)
			{
			  c++;	
			}
			i++;
		}while(i<=n);
		
		if(c==2)
			System.out.println("prime");
		else
			System.out.println("not a prime");
		
		
	}
}
				