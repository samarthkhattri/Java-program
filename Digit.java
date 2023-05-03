 import java.util.Scanner;
 class Digit
 {
  public static void main(String args[])
  {
	  int a,b,c,d;
	  Scanner sd = new Scanner(System.in);
	  System.out.println("ENTER ANY INTEGER");
	  a=sd.nextInt();
	  
	  if(a>=1000 && a<=9999)
	  {
		b=a/100;
		c=a%100;
		d=b+c;
		
		if(d%2==0)
			System.out.println("ODD");
		else 
			System.out.println("EVEN");
	  }
	  else
		  System.out.println(" not a four digit no.s");
	  
  }
 }  