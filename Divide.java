import java.util.Scanner;
class Divide	
{
    public static void main(String args[])
    {
        int n,m,s,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if (n>=1000 && n<=9999)
        {
            m=n/100;
			s=n%100;
			s2=m+s;
            System.out.println("sum:"+s2);
			
			
        }
		else
			System.out.println("not a four digit no.");
        
    }
}