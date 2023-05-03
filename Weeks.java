import java.util.Scanner;
class Weeks
{
   public static void main(String args[])
   {
	   int a;
	   Scanner sd = new Scanner(System.in);
	   System.out.println("ENTER A NUMBER");
	   
	   a=sd.nextInt();
	   
	   switch(a)
	   {
		   case 1 : System.out.println("SUNDAY");
		             break;
		    case 2 : System.out.println("MONDAY");
		             break;
			case 3 : System.out.println("TUESDAY");
		             break;
		    case 4 : System.out.println("WEDNESDAY");
		             break;
		    case 5 : System.out.println("THURSDAY");
		             break;
			case 6 : System.out.println("FRIDAY");
		             break;
		    case 7 : System.out.println("SATURDAY");
		             break;
			default : System.out.println("INVAILD NUMBER");
			
	   }
   }
}   
		   