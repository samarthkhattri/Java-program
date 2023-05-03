import java.util.*;
class Pal_prime
{
	public static void main(String args[])
	{
		int n,i=1,c=0,rev=0,temp=0,store=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter a no.");
		
		n=ds.nextInt();
		store=n;
		while(i<=n)
		{
			if(n%i==0)
			{
			  c++;	
			}
			i++;
		}
			
			while(n!=0)
			{
				temp=n%10;
				rev=rev*10+temp;
				n=n/10;
			}
			if(c==2 && rev==store)
	    	System.out.println("Pal Palindrome no.");
				else
	    	System.out.println("Not a pal palindrome No.");
	}
}
			