import java.util.Scanner;
class Even_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 even number");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		System.out.println("Displaying even no");
		for(i=0;i<10;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}