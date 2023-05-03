import java.util.Scanner;
class Binary_search2
{
	public static void main(String args[])
	{
		int a[]= new int[10];
		int i,first=0,last=9,mid=0,search=0;
		
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10  no.s in descending order");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		
		    System.out.println("Enter the no. to be searched");
			search=sd.nextInt();
			mid=(first+last)/2;
			
			while(first<=last)
			{
				if(a[mid]>search)
				{
					first=mid+1;
				}
				else if(a[mid]==search)
				{
					
		         System.out.println("No. found at position="+(mid+1));
				 break;
				}
				
				else{
					last=mid-1;
				}
				
				mid=(first+last)/2;
			}
			
			if(first>last)
			{
		         System.out.println("No. not found");
			}
	}
}