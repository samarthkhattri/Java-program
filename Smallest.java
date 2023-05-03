import java.util.*;
class Smallest
{
    public static void main(String args[])
	{
		int n,i=1,Small=0,flag=1;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			
			if(flag==1)
			{
				Small = n;
				flag = 0;
			}
			if(Small>=n)
			{
				Small=n;
			}
			i++;
		}
		System.out.println("Smallest="+Small);
	}
}
			
			
				

		