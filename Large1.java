import java.util.*;
class Large1
{
    public static void main(String args[])
	{
		int n,large=0,flag=1,temp=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter largest no.");
		n=ds.nextInt();
		
		while(n>0)
		{
			temp=n%10;
						
			if(flag==1) 
			{
				large = temp;
				flag = 0;
			}
			if(large<=temp)
			{
				large=temp;
			}
			n=n/10;
			
			
		}
		System.out.println("Largest digit="+large);
	}
}
	