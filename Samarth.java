import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		int a, b, c,d;
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter two number");
		
		a= s1.nextInt();
		b= s1.nextInt();
		c= a-b;
		d= a*b;
		System.out.println("subtraction="+c);
		System.out.println("multiplication="+c);
	}
}	