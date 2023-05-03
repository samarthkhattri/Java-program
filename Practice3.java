import java.util.Scanner;
class Practice3
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int i,found=0,pro=1;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 5 number");
		
		for(i=0;i<5;i++)
		{
			a[i]=sd.nextInt();
			pro=pro*a[i];
		}
	 
	    System.out.println("Sum of 5 no:"+pro);

        for(i=0;i<10;i++)
      	{
			found=1;		
            break;
		  
		}

	}
}