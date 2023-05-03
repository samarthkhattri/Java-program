import java.util.Scanner;
class New2
{
	public static void main(String args[])
	{
		int ch,a;
		int b;
		int c;
		Scanner fd = new Scanner(System.in);
		System.out.println("1. CHECK WEATHER EVEN ORR ODD");
		System.out.println("2. CHECK WEATHER 2  DIGIT NO. OR NOT");
		System.out.println("3. CHECK MULTIPLE OF 5 OR NOT");
		System.out.println("ENTER YOUR CHOICE");
		
		ch=fd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("EVEN OR ODD");
			         a=fd.nextInt();
					 System.out.println(a % 2 == 0?"EVEN":"ODD");
					 break;
					 
			case 2 : System.out.println(" 2 DIGIT NO. OR NOT ");
				     b=fd.nextInt();
					 System.out.println(b / 10 == 0 && b / 100 == 0?"NOT A  DIGIT NO.":"2 DIGIT NO.");
					 break;
					 
			case 3 : System.out.println(" MULTIPLE OF 5");
				    c=fd.nextInt();
					System.out.println(c % 5 == 0?" MULTIPLE OF 5": "NOT A MULTIPLE OF 5");
					break;
		}
	}
}
					