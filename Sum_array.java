import java.util.Scanner;
class Sum_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,s=1;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 No.");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		
		
		for(i=0;i<10;i++)
		{
			s=s+a[i];
		
		}
		System.out.println("sum="+s);
	}
}
		
			
		
		