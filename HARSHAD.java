import java.util.Scanner;
class HARSHAD
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
			s=s+temp;
			n=n/10;
		}
		 
		 if(store%s==0)
			 System.out.println("yes Harshad no.");
		 else
			 System.out.println("Not a harshad no.");
	}
}
			