import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}