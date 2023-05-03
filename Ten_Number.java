import java.util.*;
class Ten_Number
{
    public static void main(String args[])
	{
		int n,i=1,s=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			s=s+n;
			i++;
		}
		System.out.println("Sum="+s);
		
	}
}
		