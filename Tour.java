import java.util.Scanner;
class Tour
{
   public static void main(String args[])
   {
	   int n,f;
	   Scanner sf = new Scanner(System.in);
	   System.out.println("ENTER THE KM TRAVELLED");
	   
	   n=sf.nextInt();
	   
	   if(n>=1 && n<=10)
	   {
			f=n*40;
			System.out.println("CHARGE:-"+f);
	   }	
	   else if(n>=11 && n<=20)
	   {
		   f=n*30;
		   System.out.println("CHARGE:-"+f);
	   }
		else if(n>=30)
		{
			f=n*25;
			System.out.println("CHARGE:-"+f);
		}
   }
}   