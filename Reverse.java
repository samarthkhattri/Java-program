import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		int n,rev=0,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
		n=sc.nextInt();
		
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reverse="+rev);
	}
}

		