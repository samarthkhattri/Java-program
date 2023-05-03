import java.util.*;
class Large2
{
    public static void main(String args[])
	{
		int n,i=1,big=1;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter ten no.");
		
		while(i<=10)
		{
			n=ds.nextInt();
			
			if(n>0)
			{
				big=0;
			}
			i++;
		}
		if(big==1)
			System.out.println("Largest=");
		
	}
}
			