import java.util.Scanner;
class Fruits
{
   public static void main(String args[])
   {
	   int a;
	   Scanner sd = new Scanner(System.in);
	   System.out.println("ENTER AN ALPHABHET");
	   
	   a=sd.nextInt();
	   
	   switch(a%2)
	   {
		   case 0 : System.out.println("EVEN");
		   break;
		   
		   default : System.out.println("INVALID ENTRY");
		   
	   }
   }
}
