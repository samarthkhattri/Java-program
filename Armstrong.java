import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int n,temp=0,s=0,store=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sd.nextInt();
		store=n;
		
		while(n>0)
		{
			temp=n%10;
			s=s+temp*temp*temp;
			n=n/10;
		}
		if(s==store)
			System.out.println("yes armstrong no");
		else
			System.out.println("not a armstrong no");
	}
}