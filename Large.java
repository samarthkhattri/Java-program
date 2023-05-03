import java.util.*;
class Large
{
    public static void main(String args[])
	{
		int n,i=1,large=0,flag=1;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			
			if(flag==1)
			{
				large = n;
				flag = 0;
			}
			if(large<=n)
			{
				large=n;
			}
			i++;
		}
		System.out.println("Largest="+large);
	}
}
			
			
				

		