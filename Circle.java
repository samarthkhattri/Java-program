import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
		float r,ar,cir;
		Scanner a3 = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		
		r= a3.nextFloat();
		ar= 3.14f*r*r;
		cir= 2f*3.14f*r;
		
		System.out.println("area of circle="+ar);
		System.out.println("Circumfrence="+cir);
	}
}	
	
		