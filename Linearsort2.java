import java.util.Scanner;
class Linearsort2
{
	public static void main(String args[])
	{
		int a[]= new int[10];
		int i,j,temp=0;
		
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 no");

		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("After linear sort");
		for(i=0;i<10;i++)
		{
		System.out.println(a[i]);
		}
	}
}