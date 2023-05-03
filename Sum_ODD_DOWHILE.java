import java.util.Scanner;
class Sum_ODD_DOWHILE
{
	public static void main(String args[])
	{
		int n,sum=0,t=0;
		Scanner ds = new Scanner(System.in);
		System.out.println("Enter a no to add");
		n=ds.nextInt();
		
		do
		{
			t=n%10;
			if(t%2!=0)
			{
			sum=sum+t;
			}
			n=n/10;
			
		}while(n>0);
		System.out.println("Sum="+sum);
	}
}
