import java.util.Scanner;
class Menu4
{
	public static void main(String args[])
	{
		int ch,a;
		int b;
		int c;
		Scanner fd = new Scanner(System.in);
		System.out.println("1. Even or odd");
		System.out.println("2. Two digit number");
		System.out.println("3. Multiple of 5 or not");
		System.out.println("ENTER A VALUE OF YOUR CHOICE");
		
		ch= fd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("ENTER A VALUE");
			         a=fd.nextInt();
			         System.out.println(a % 2 == 0?"EVEN":"ODD");
			         break;
					 
			case 2 : System.out.println("ENTER A VALUE TO CHECK TWO DIGIT OR NOT");
			         b=fd.nextInt();
			         System.out.println(b / 10 == 0 && b / 100 == 0?"NOT A TWO DIGIT NO.":"TWO DIGIT NO.");
			         break;		 
				
			case 3 : System.out.println("ENTER A VALUE TO CHECK MULTIPLE OF 5 OR NOT");
			         c=fd.nextInt();
			         System.out.println(c % 5 == 0?"MULTIPLE OF 5.":"NOT A MULTIPLE OF 5");
			         break;		 	
		}	       
	}
}	