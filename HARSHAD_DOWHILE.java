import java.util.Scanner;
class HARSHAD_DOWHILE
{
	public static void main(String args[])
	{
		int n,temp=0,s=0,store=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter a no.");
		n=sd.nextInt();
		store=n;
		
		do
		{
			temp=n%10;
			s=s+temp;
			n=n/10;
		}while(n>0);
		
		if(store%s==0)
			System.out.println("HARSHAD NO");
		else
			System.out.println("NOT HARSHAD NO");
	}
}
		