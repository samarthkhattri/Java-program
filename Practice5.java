import java.util.Scanner;
class Practice5
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int i,j=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 5 number");
		
		for(i=1;i<5;i++)
		{
			a[i]=sd.nextInt();
		}
		
		for(i=1;i<5;i++)
		{
		  for(j=1;j<a[i];j++)
		   {
			if(a[i]!=j)
			{
		   System.out.println("unique no");
			}
			else
			{
		   System.out.println("unique no");
			}
			
		   }
		   
		   
		}
	}
}
		