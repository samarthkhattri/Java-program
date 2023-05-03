import java.util.Scanner;
class DO_WHILE_TABLE
{
	public static void main(String args[])
	{
		int i,m=1;
		Scanner sd = new Scanner(System.in);
		System.out.println("enter a number");
		i=sd.nextInt();
		
		do
		{
			System.out.println(i*m);
			m++;
		}while(m<=10);
	}
}
		