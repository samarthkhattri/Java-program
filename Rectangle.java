import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		int l,b,ar,pre;
		Scanner a1 = new Scanner(System.in);
		System.out.println("enter length and breadth");
		
		l= a1.nextInt();
		b= a1.nextInt();
		ar= l*b;
		pre= 2*(l+b);
		
		System.out.println("area="+ar);
		System.out.println("prameter="+pre);
	}
}	