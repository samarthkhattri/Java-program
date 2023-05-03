import java.util.Scanner;
class Menu3
{
	public static void main(String args[])
	{
		int ch,s,v1;
		int l,b,h,v2;
		double g,t,v3;
		Scanner sd = new Scanner(System.in);
		System.out.println("1. VOL. OF CUBE");
		System.out.println("2. VOL. OF CUBOID");
		System.out.println("3. VOL. OF CYLINDER");
		System.out.println("Enter Your Choice");
		
		ch=sd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("ENTER THE CUBE'S VALUE");
			s = sd.nextInt();
			v1 = s*s*s;
			System.out.println("VOL. OF CUBE="+v1);
			break;
			
			case 2 : System.out.println("ENTER THE CUBOID'S");
			l = sd.nextInt();
			b = sd.nextInt();
			h = sd.nextInt();
			v2 = l*b*h;
			System.out.println("VOL. OF CUBOID="+v2);
			break;
			
			case 3 : System.out.println("ENTER THE CYLINDER'S VALUE ");
			g = sd.nextDouble();
			t = sd.nextDouble();
			v3 = 3.14*g*g*t;
			System.out.println("VOL. OF CYLINDER="+v3);
			break;
			
			default : System.out.println("INVALID INPUT");
		}
	}
}