import java.util.Scanner;
class Practice4
{
	public static void main(String args[])
	{
		int a[] = new int [5];
		int i,found=0,sum=0,c=0;
		double average=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter five number");
		
		for(i=0;i<5;i++)
		{
			a[i]=sd.nextInt();
			
		}
		
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
			 sum=(sum+a[i]);
				c++;
			}
		}
		
		   average=(sum/c);
		   System.out.println("Average="+average);
	}
}