

import java.util.Scanner;
class Anshu
{
	public static void main(String args[])
	{
		int a,b,c;
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter the value X and Y");
			
			a = s1.nextInt();
			b = s1.nextInt();
		}
		System.out.println("BEFORE SWAPPING THE VALUE :"+a +"  "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("AFTER SWAPPING THE VALUE :"+a +"  "+b);
		System.out.println();
	}
}	