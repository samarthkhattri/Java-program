import java.util.Scanner;
class PalindromeExample
{  
    public static void main(String args[])
	{  
      int n,sum=1,temp=0,store=0,r=0;    
      System.out.println("Enter a number");
	  Scanner sd = new Scanner(System.in);
	  n=sd.nextInt();
	  store=n;
	  
  
         
  while(n>0)
  {    
   temp=n%10;   
   sum=(sum*temp)+r;    
   n=n/10;    
  }    
  if(==sum)    
    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  