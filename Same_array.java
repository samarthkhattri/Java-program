import java.util.Scanner;
class Same_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,c=0,first=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter 10 no");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
			
		}
		   first=a[0];
		   
		for(i=0;i<10;i++)
		{
			if(first==a[i])
			{
				c++;
			}
		}
		
		
		if(c==10)
			System.out.println("all number are same");
		else
			System.out.println("all number are not same");
	}
}
