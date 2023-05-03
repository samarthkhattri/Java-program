import java.util.Scanner;
class Spy
{
	public static void main(String args[])
	{
		int n,temp=0,s=0,p=1;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter a no.");
		n=sd.nextInt();
		
		
		while(n>0)
		{
			temp=n%10;
			s=s+temp;
			p=p*temp;
			n=n/10;
		}
		if(p==s)
			System.out.println("Spy no.");
		else
			System.out.println("not a spy no.");
	}
}
		