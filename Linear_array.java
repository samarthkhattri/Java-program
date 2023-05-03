import java.util.Scanner;
class Linear_array
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i,search=0,position=0,found=0;
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter ten no");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextInt();
		}
		
       		System.out.println("Enter no to be searched:");
			search=sd.nextInt();
		for(i=0;i<10;i++)
		{
			if(search==a[i])
			{
				found=1;
				position=i+1;
				break;
			}
		}
			if(found==1)
			{
       		System.out.println("number found at position:"+position);
			}
			else
			{
       		System.out.println("Number not found");
			}
			
		
	}
}
			