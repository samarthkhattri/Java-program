import java.util.*;
class Even_digit_only
{                                                      

    public static void main(String args[])
	{
		int n,s=0,t=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter a no.");
		n=ds.nextInt();
		
		while(n>0)
			
		{
			t=n%10;
			if(t%2==0)
			{
				s=s+t;
			}
			n=n/10;
		}
			System.out.println("s="+s);
				
				
				
			
		
	}
}
		