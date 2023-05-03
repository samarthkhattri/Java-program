import java.util.Scanner;
class Neon
{
   public static void main(String args[])
   {
	   int n,temp=0,s=0,sum=0;
	   Scanner sd = new Scanner (System.in);
	   System.out.println("Enter A Number");
	   
	   n= sd.nextInt();
	   s=n*n;
	   
	   while(s>0)
	   {  
	   temp=s%10;
	   sum=sum+temp;
	   s=s/10;
	   }
	   if(sum==n)
	   System.out.println("Neon number");
		else
	   System.out.println("Not Neon number");
   }
}
	   
	   