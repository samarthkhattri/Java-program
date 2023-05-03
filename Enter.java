import java.util.Scanner;
class Enter
{
	public static void main(String args[])
	{
		int a,b,r;
		Scanner sa = new Scanner(System.in);
		System.out.println("enter two value");
		a = sa.nextInt();
		b = sa.nextInt();
		
	  if(a==0 || b==0)
	  {
		System.out.println("Invalid Entry");
	  }
	   else
	   {	   
	  
		if(a>b)
		{
			r=a/b;
		}	
		 else
		{
			r=b/a;
		}
	  		 System.out.println("RESULT"+r);
	   }
	}		
	
	
}	