  import java.util.Scanner;
class Largest_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,large=0,small=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter 10 Number");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		    large= a[0];
		    small= a[0];
		}
			
		for(i=0;i<10;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Largest="+large);
		System.out.println("smallest="+small);
	}
}

	
			
			