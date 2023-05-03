import java.util.Scanner;
class Menu
{
	public static void main(String args[])
	{
		int ch,l,b,ar1;
		double g,ar2;
		Scanner sd = new Scanner(System.in);
		System.out.println("(a). Area of Reactangle");
		System.out.println("2. Area of Circle");
		System.out.println("Enter Your Choice");
		
		ch=sd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("ENTER THE LENGTH AND BREADTH");
			l = sd.nextInt();
			b = sd.nextInt();
			ar1 = l*b;
			System.out.println("Area="+ar1);
			break;
			
			case 2 : System.out.println("ENTER THE RADIUS");
			g = sd.nextDouble();
			ar2 = 3.14*g*g;
			System.out.println("Area="+ar2);
			break;
			
			default : System.out.println("INVALID INPUT");
		}
	}
}
			
			
			
			