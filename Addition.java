import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter two number");
		
		a= s1.nextInt();
		b= s1.nextInt();
		c= a+b;
		
		System.out.println("sum="+c);
	}
}	