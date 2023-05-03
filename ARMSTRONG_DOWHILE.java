import java.util.Scanner;
class ARMSTRONG_DOWHILE
{
	public static void main(String args[])
	{
		int n,temp=0,s=0,store=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("enter a number");
		n=sd.nextInt();
		store=n;
		
		do
		{
			temp=n%10;
			s=s+temp*temp*temp;
			n=n/10;
			
		}while(n>0);
		if(s==store)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NOT A ARMSTRONG");
	}
}
		