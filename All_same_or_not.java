import java.util.*;
class All_same_or_not
{                                                      //COUNTER METHOD
    public static void main(String args[])
	{
		int n,i=1,c=0,flag=1,first=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten even no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			if(flag==1)
			{
				first=n;
				flag=o;
			}
			if(first==n)
			{
				c++;
			}
			i++;
		}
		
			
			
		}
		if(c==10)
			System.out.println("all number are same");
		else
			System.out.println("all number are not same");
		
		
	}
}