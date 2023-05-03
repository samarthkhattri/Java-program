import java.util.Scanner;
class Gfd
{
   public static void main(String args[])
   {
	   int n;
	   Scanner sf = new Scanner(System.in);
	   System.out.println("ENTER THREE DIGIT NO");
	   
	   n=sf.nextInt();
	   
	   
	   System.out.println(n%7==0 || n%10==7?"ENTERED VALUE IS BUZZ NUMBER":"NO DIVISIBLE BY 7");
   }
}   