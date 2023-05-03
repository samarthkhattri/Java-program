import java.util.Scanner;
class Table_forloop
{
	public static void main(String args[])
	{
		int n,i=1;
		
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter a number");
		n=sd.nextInt();
		
		for(i=1;i<=10;i++)
		{
		  System.out.println(n*i);	
		}
		 
	}
}