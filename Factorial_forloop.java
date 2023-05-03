import java.util.Scanner;
class Factorial_forloop
{
	public static void main(String args[])
	{
	  int n,i=1,f=1;
	  Scanner sd = new Scanner (System.in);
	  System.out.println("Enter a number");
	  n=sd.nextInt();
	
	   for(i=1;i<=n;i++)
	  {
       f=f*i;
	   }
	   System.out.println("factorial="+f);
	}
	
}