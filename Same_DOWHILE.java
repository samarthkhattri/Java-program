import java.util.Scanner;
class Same_DOWHILE
{
	public static void main(String args[])
	{
		int n,i=1,c=0,flag=1,first=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		
		do
		{
			
			n=sd.nextInt();
			if(flag==1)
			{
				first=n;
				flag=0;
			}
			if(first==n)
			{
				c++;
			}
			i++;
		}while(i<=10);
		
		
		if(c==10)
			System.out.println("all number are same");
		else
			System.out.println("all number are not same");
	}
}
		
			