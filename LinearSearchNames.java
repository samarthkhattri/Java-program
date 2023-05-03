import java.util.Scanner;
class LinearSearchNames 
{
	
    public static void main(String[] args)
	{
        String[] a = new String[10];
        int i,j;
		String temp;
		
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 names in ascending order:");
		
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextLine();
		}
		
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("after linear sort");
		
		for(i=0;i<10;i++)
		{
		System.out.println(a[i]);
		}
	}
}
			
	