import java.util.*;
class Perfect
{
   public static void main(String args[])
   {
      int n,i=1,s=0;
	  Scanner de = new Scanner(System.in);
	  System.out.println("Enter a number");
	  
	  n=de.nextInt();
	  
	  while(i<n)
	  {
		  if(n%i==0)
		  {
			  s=s+i;
		  }
			  i++;
	  }
	  if(s==n)
		  System.out.println("perfect no");
	  else
		  System.out.println("not a perfect no");
   }
}
		  
			  
   