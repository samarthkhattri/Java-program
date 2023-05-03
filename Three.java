import java.util.Scanner;
class Three
{
	public static void main(String  args[])
	{ 
	   int a,b,c,largest=0;
	   Scanner sd = new Scanner(System.in);
	   
	   System.out.println("ENTER FIRST NUMBER");
	   a=sd.nextInt();
	   System.out.println("ENTER SECOND NUMBER");
	   b=sd.nextInt();
	   System.out.println("ENTER THIRD NUMBER");
	   c=sd.nextInt();
	   
	   if(a>b && a>b)
		   largest = a;	
       if(b>a && b>c)
		   largest = b;
       if(c>a && c>b)
		   largest = c;	   
	 
	 
        System.out.println("Largest:"+largest);	 
	 
	}
	
	
	
}	
	
	   