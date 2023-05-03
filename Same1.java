import java.util.Scanner;
class Same1
{
	public static void main(String args[])
	{
		int n,s=0,flag=1,temp=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sd.nextInt();
		
		while(n>0)
		{
			temp=n%10;
			if(flag==1)
			{
				s=temp;
				flag=0;
			}
			if(s==temp)
			{
				s++;
			}
			n=n/10;
			
			if(s==0)
				System.out.println("all digit are same");
			else
				System.out.println("all digit are not same");
		}
	}
}
		
		
		