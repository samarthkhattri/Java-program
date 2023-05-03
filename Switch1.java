import java.util.Scanner;
class Switch1
{
	public static void main(String args[])
	{
		int ch,a,V1;
		int l,b,h,V2;
		double r,g,V3;
		Scanner sd = new Scanner(System.in);
		System.out.println("1.Volume Of Cube");
		System.out.println("2.Volume Of Cuboid");
		System.out.println("3.Volume Of Cylinder");
		System.out.println("Enter Value Of Your Choice");
		
		ch= sd.nextInt();
		
		switch(ch)
		{
			case 1 : System.out.println("ENTER A VALUE");
			         a=sd.nextInt();
					 V1= a*a*a;
                     System.out.println("Vol. Of Cube:"+V1);
                     break;
						
			case 2 : System.out.println("Enter A Value");
			        l=sd.nextInt();
	            	b=sd.nextInt();
					h=sd.nextInt();
					V2= l*b*h;
					System.out.println("Vol. Of Cuboid:"+V2);
					break;
					
			case 3 : System.out.println("Enter A Value");
                    r=sd.nextDouble();
                    g=sd.nextDouble();
					V3= 3.14*r*r*g;
                    System.out.println("Vol. of Cylinder:"+V3);
					break;
					
			default : System.out.println("INVALID INPUT");		
		}
	}
}	
		
