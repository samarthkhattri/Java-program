import java.util.Scanner;
class Cylinder
{
	public static void main(String args[])
	{
	  float r,h,v,tsa;
	  Scanner a1 = new Scanner(System.in);
	  System.out.println("Enter radius and height of a cylinder");
	  
	  r= a1.nextFloat();
	  h= a1.nextFloat();
	  v= 3.14f*r*r*h;
	  tsa= 2f*3.14f*r*r+2f*3.14f*r*h;
	  
	  System.out.println("volume="+v);
	  System.out.println("total surface area="+tsa);
	  
	}
}