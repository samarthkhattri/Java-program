import java.util.Scanner;
class Multiple2
{
    public static void main(String args[])
    {
        int n,m,s,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if (n>=10000 && n<=99999)
        {
            m=(n/100)%10;
			s=n%10;
			a=m+n;
			
			if(a%5==0)
				System.out.println("yes it is multiple of five");
			else
				System.out.println("no its not a multiple of five");
			
		}
	}
	
			
			
}			
			
			
			
	