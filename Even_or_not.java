import java.util.Scanner;
class Even_or_not
{
   public static void main(String args[])
   {
	   int n,f;
	   Scanner sf = new Scanner(System.in);
	   System.out.println("enter two number");
	   
	   n=sf.nextInt();
	   f=sf.nextInt();
	   
	   System.out.println(n%2==0 && f%2==0?"Both no. is even":"not even");
   }
}   
	   
	   