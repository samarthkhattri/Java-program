import java.util.Scanner;
class Xyz
{
	public static void main(String args[])
	{
		int a;
		Scanner fs = new Scanner(System.in);
		System.out.println("Enter a value");
		a=fs.nextInt();
		
		if(a%5==0)
		System.out.println("MULTIPLE OF 5");
		else
		System.out.println("NOT A MULTIPLE OF 5");;
	}
}	