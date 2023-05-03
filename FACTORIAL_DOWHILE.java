import java.util.*;
class FACTORIAL_DOWHILE
{
	public static void main(String args[])
	{
		int n,i=1,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		
		do
		{
			f=f*i;
			i++;
		}while(i<=n);
		System.out.println("Factorial="+f);
		
	}
}
		