import java.util.Scanner;
class Extract
{
    public static void main(String args[])
    {
        int n,m,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if (n>=10000 && n<=99999)
        {
            m=(n/1000)%10;
            System.out.println("2 digit:"+m);
			s=(n/10)%10;
			System.out.println("2 last digit:"+s);
        }
        
    }
}