import java.util.Scanner;
class Check2
{
  public static void main(String args[])
  {
   
		int a,b,c;
		Scanner sa = new Scanner(System.in);
		
		System.out.println("enter 3 no.s : ");
		a = sa.nextInt();
		b = sa.nextInt();
		c = sa.nextInt();
		
		  if(a!=b && b!=c && c!=a)
		System.out.println("yes all unique");
	      else
			  System.out.println("not unique");
			  
		
  }
}  

