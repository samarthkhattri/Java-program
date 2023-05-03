import java.util.Scanner;
class Month_Days
{
   public static void main(String args[])
   {
	   int a;
	   Scanner s = new Scanner(System.in);
	   System.out.println("ENTER A NUMBER");
	   
	   a=s.nextInt();
	   
	   switch(a)
	   {
		   case 1 : System.out.println("FRIDAY");
		           break;
				  
		   
		   case 8 : System.out.println("FRIDAY");
		           break;
		   
		   case 15: System.out.println("FRIDAY");
		           break;
		   
		   case 22 : System.out.println("FRIDAY");
		           break;
		   
		   case 29: System.out.println("FRIDAY" );
		           break;
		   
		   
		   default : System.out.println("WEEK DAY");
	   }
   }
}