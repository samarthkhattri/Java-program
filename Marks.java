import java.util.Scanner;
class Marks
{
   public static void main(String args[])
   {
	   int n;
	   Scanner sf = new Scanner(System.in);
	   System.out.println("ENTER THE MARKS OBTAINED");
	   
	   n=sf.nextInt();
	   
	   if(n>=90)
	   {
			
			System.out.println("GRADE:- A");
	   }	
	   else if(n>=70 && n<=89)
	   {
		   
		   System.out.println("GRADE:-");
	   }
		else if(n>=50 && n<=59)
		{
			
			System.out.println("GRADE:-");
		}
		else if(n<50)
		{
			
			System.out.println("GRADE:-");
		}
   } 
   
}   