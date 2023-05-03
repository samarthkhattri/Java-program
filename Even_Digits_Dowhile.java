import java.util.Scanner;
class Even_Digits_Dowhile
{
	public static void main(String args[])
	{
		int n,even=1,t=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter A Number");
		n=sd.nextInt();
		
		do
		{   t=n%10; 
			if(t%2!=0)
				
			{
		
				even=0;
			}
			n=n/10;
		}while(n>0);
		
		if(even==1)
			System.out.println("All digits even");
		else
			System.out.println("Not all digits even");
	}
}
		
			
		
			
		
		