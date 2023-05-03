import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n, i=1,c=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter a no.");
		
		n=ds.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
			  c++;	
			}
			i++;
		}
		  if(c==2)
			  System.out.println("yes its a prime no.");
		  else
			  System.out.println("no it is not a prime no.");
	}
}
			
