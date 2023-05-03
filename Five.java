import java.util.Scanner;
class Five
{
	public static void main(String args[])
	{
		int a;
		Scanner sg = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		
		a=sg.nextInt();
		
		if(a%5==0)
			System.out.println("MULTIPLE OF 5");
		else
			System.out.println("NOT a multiple of 5");
	}
}	


	