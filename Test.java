import java.util.Scanner;
class Test
{
   public static void main(String args[])
   {
	   int n;
	   Scanner sf = new Scanner(System.in);
	   System.out.println("ENTER A NUMBER");
	   
	   n=sf.nextInt();
	   
	   System.out.println(n%2==0?"POSITIVE":"NEGATIVE");
	   
   }
}   