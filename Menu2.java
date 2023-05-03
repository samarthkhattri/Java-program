import java.util.Scanner;
class Menu2
{
	public static void main(String args[])
	{
		int ch,s,pr1;
		int a,b,pr2;
		double g,cr1;
		Scanner sd = new Scanner(System.in);
		System.out.println("1. Perimeter of square");
		System.out.println("2. Perimeter of rectangle");
		System.out.println("3. Circumference of circle");
		System.out.println("Enter Your Choice");
		
		ch=sd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("ENTER THE sq. value");
			s = sd.nextInt();
			pr1 = 4*s;
			System.out.println("Perimeter of sq.="+pr1);
			break;
			
			case 2 : System.out.println("ENTER THE sq. value");
			a = sd.nextInt();
			b = sd.nextInt();
			pr2 = 2*(a+b);
			System.out.println("Perimeter of sq.="+pr2);
			break;
			
			case 3 : System.out.println("ENTER THE CIRCUMFERENCE of CIRCLE ");
			g = sd.nextDouble();
			cr1 = 2*3.14*g;
			System.out.println("CIR. OF CIRCLE="+cr1);
			break;
			
			default : System.out.println("INVALID INPUT");
		}
	}
}