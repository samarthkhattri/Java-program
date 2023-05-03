import java.util.Scanner;
class Sum_of_even_dowhile
{
	public static void main(String args[])
	{
		int n, i=1,s=0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter ten number");
		
	   do
	   {
		   n=sd.nextInt();
		   if(n%2==0)
		   {
			   s=s+n;
		       
		   }
		   i++;
	   }while(i<=10);
	   System.out.println("Sum="+s);
	}
}
