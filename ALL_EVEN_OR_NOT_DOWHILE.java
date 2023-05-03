import java.util.Scanner;
class ALL_EVEN_OR_NOT_DOWHILE
{
	public static void main(String args[])
	{
		int n,i=1,c=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter a no");
		
		do
		{
			n=sd.nextInt();
			if(n%2==0)
			{
				c++;
			}
			i++;
		}while(i<=10);
		
		if(c==10)
		System.out.println("All Even");
			else
		System.out.println("Not all even");
	}
}