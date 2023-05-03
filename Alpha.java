import java.util.Scanner;
class Alpha
{
   public static void main(String args[])
   {
	   char n;
	   Scanner ds = new Scanner(System.in);
	   System.out.println("ENTER A ALPHABHET");
	   
	   n=ds.next().trim().charAt(0);
	   
	   System.out.println(n=='a' || n=='e' || n=='i' || n=='o' || n=='u'?"VOWEL":"CONSONANT");
   }
}   