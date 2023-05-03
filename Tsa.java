import java.util.Scanner;
class Tsa
{
	public static void main(String args[])
	{
		int l,b,h,v,tsa;
		Scanner a2 = new Scanner(System.in);
		System.out.println("Enter length breath and height");
		
		l= a2.nextInt();
		b= a2.nextInt();
		h= a2.nextInt();
		v= l*b*h;
		tsa= 2*(l*b+b*h+h*l);
		
		System.out.println("value="+v);
		System.out.println("total surface area="+tsa);
	}
}	
	
	
		
		