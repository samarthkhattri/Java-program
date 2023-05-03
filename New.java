import java.util.Scanner;

class New
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner gf = new Scanner(System.in);
		System.out.println("ENTER A 4 DIGIT NUMBER");
		
		a=gf.nextInt();
		
		b=a/1000;
		c=a%10;
		
		System.out.println("first digit:"+b);
		System.out.println("last digit:"+c);
	}
}	