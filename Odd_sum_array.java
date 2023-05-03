import java.util.Scanner;
class Odd_sum_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,s=1;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter 10 no");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		for(i=0;i<10;i++)
		{
			if(a[i]%2!=0)
			{
				s=s+a[i];
			}
		}
		   System.out.println("Sum of odd="+s);
	}
}
		