import java.util.*;
class Even
{
    public static void main(String args[])
	{
		int n,i=1,s=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten even no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			if(n%2==0)
			{
				s=s+n;
			}
			i++;
		}
		System.out.println("Sum="+s);
		
		
	}
}
		