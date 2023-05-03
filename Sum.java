import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		int n,sum=0,t=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter a no to add");
		n=ds.nextInt();
		
		while(n>0)
		{
			t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println("Sum="+sum);
	}
}
