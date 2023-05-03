import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		int a[]= new int[10];
		int i;
		Scanner sd = new Scanner (System.in);
		System.out.println("enter 10 NO.");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		System.out.println("Displaying the no");
		
		for(i=0;i<10;i++)
		{
		System.out.println(a[i]);
		}
	}
}
			
		