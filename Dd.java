import java.util.Scanner;

class Dd
{
	public static void main(String args[])
	{
		int n,m;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER A INTEGER");
		
		n=sd.nextInt();
		
		if(n>=10000 && n<=99999)
		{
			m=(n/100)%10;
			System.out.println("middle digit:-"+m);
		}
		else 
			System.out.println("not a middle digit");
	}
}	