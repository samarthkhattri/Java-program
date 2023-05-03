import java.util.Scanner;
class Practice
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int i,search=0,position=0,found=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter 5 no");
		
		for(i=0;i<5;i++)
		{
			a[i]=sd.nextInt();
		}
		 System.out.println("Enter no to be searched");
		 search=sd.nextInt();
		 
		 for(i=0;i<5;i++)
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
		 System.out.println("Number found at position:"+position);
		 }
		 else
		 {
		 System.out.println("Number not found");
		 }
	}
}
			 