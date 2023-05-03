import java.util.Scanner;
class Alpha1
{
   public static void main(String args[])
   {
	   char n;
	   Scanner ds = new Scanner(System.in);
	   System.out.println("ENTER A ALPHABHET");
	   
	   n=ds.next().trim().charAt(0);
	   
	   switch(n)
	   {
			
		 case 'a' :

         case 'e' : 

		 case 'i' :
		
		 case 'o' : 
		
		 case 'u' : 
		    System.out.println(n + ":Vowel");
			break;
		
		 default : System.out.println(n + ":Consonent");
	   }
   }
}   
    