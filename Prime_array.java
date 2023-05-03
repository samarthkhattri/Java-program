import java.util.Scanner;
class Prime_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,j=0,c=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 no");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		  
		  
		for(i=0;i<10;i++)
		{
		  for(j=1;j<=a[i];j++)
		  {
			if(a[i]%j==0)
			{
              c++;
			}
		  }
		
		  if(c==2)
		  {
			  a[i]=0;
		  }
		  c=0; //refresh point
		}
		
		System.out.println("Modified array");
		
		for(i=0;i<10;i++)
		{
			
		    System.out.println(a[i]);
		}
	}
	
}
		