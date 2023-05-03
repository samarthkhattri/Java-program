import java.util.Scanner;
class Only_Odd
{
	public static void main(String args[])
	{
		int n,temp=0,odd=1;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		n=sd.nextInt();
		
		while(n>0)
		{
			temp=n%10;
			
			if(temp%2==0)
			{
				odd=0;
			}
			n=n/10;
			
		}
		if(odd==1)
			System.out.println("odd");
		else
			System.out.println("not odd ");
	}
}

			