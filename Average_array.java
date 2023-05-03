import java.util.Scanner;
class Average_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,c=0,sum=0;
		double avg=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("ENTER 10 NUMBER");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		
		for(i=0;i<10;i++)
		{
			if(a[i]%2==0)
			{	
				sum=(sum+a[i]);
				c++;
			}
		}
				avg=(sum/c);
				System.out.println("Average="+avg);
	}
}