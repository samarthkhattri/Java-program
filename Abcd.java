import java.util.Scanner;
class Abcd	
{
    public static void main(String args[])
    {
        int n,m,s,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if (n>=1000 && n<=9999)
        {
            m=n/1000;
			a=n%10;
			s=m+a;
			
			if(s%2==0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
			
		}
			 else
				 System.out.println("Not a 4 digit no.");
			
			
            
			
		
        
    }
}