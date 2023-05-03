import java.util.*;
class Even_and_Odd
{
    public static void main(String args[])
	{
		int n,i=1,s1=0,s2=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten even no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			if(n%2==0)
			{
				s1=s1+n;	
			}
			
			if(n%2!=0)
			{
				s2=s2+n;
			}
			i++;
			
		}
		System.out.println("Sum="+s1);
		System.out.println("Sum="+s2);
		
	}
}
		