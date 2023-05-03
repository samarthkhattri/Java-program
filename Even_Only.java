import java.util.*;
class Even_Only
{                                                      //COUNTER METHOD
    public static void main(String args[])
	{
		int n,i=1,c=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten even no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			if(n%2==0)
			{
				c++;	
			}
			i++;
			
			
		}
		if(c==10)
			System.out.println("all even no.");
		else
			System.out.println("not all even");
		
		
	}
}
		