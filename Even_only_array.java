import java.util.Scanner;
class Even_only_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,c=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 numbers");
		
		for(i=0;i<10;i++)
		{
			a[i]= sd.nextInt();
		}
		 
		for(i=0;i<10;i++)
		{
			if(a[i]%2==0)
			{
				c++;
			}
		}
		
		if(c==10)
		System.out.println("All no even");
	     else
		System.out.println("not all even");
	}
}