import java.util.Scanner;
class Replace_even_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,replace=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 no");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		  replace=a[0];
		  
		for(i=0;i<10;i++)
		{
			if(a[i]%2==0)
			{
				a[i]=0;
				
			}
		}
		
		System.out.println("Modified array");
		
		
		for(i=0;i<10;i++)
		{
			
		    System.out.println(a[i]);
		}
	}
	
}
		