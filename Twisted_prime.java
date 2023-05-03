import java.util.Scanner;
class Twisted_prime
{
	public static void main(String args[])
	{
		int n,i=1,c1=0,c2=0,j=1,temp=0,rev=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter a Number");
		
		n=sd.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
			  c1++;	
			}
			i++;
		}
		while(n!=0)
			{
				temp=n%10;
				rev=rev*10+temp;
				n=n/10;
			}
			while(j<=rev)
			{
				if(rev%j==0)
				{
					c2++;
				}
				j++;
			}
			if(c1==2 && c2==2)
				System.out.println("Twisted prime no.");
			else
				System.out.println("Not a Twisted prime no.");
	}
}

		
		
	