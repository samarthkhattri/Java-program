import java.util.Scanner;
class Value
{
   public static void main(String args[])
   {
	   int a;
	   Scanner sd = new Scanner(System.in);
	   System.out.println("ENTER A NUMBER");
	   
	   a=sd.nextInt();
	   
	   System.out.println(a>0?"Positive":a<0?"negative":"equal to zero");
   }
}   