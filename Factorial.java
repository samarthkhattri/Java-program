import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n,i=1,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		
		while(i<=n)
		{
			f=f*i;
			i++;
		}
		System.out.println("Factorial="+f);
		
	}
}
		