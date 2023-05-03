import java.util.Scanner;
class Second
{
    public static void main(String arr[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        a=sc.nextInt();
        if(a>=10000 && a<=99999)
        {
            b=(a/10)%10;
            System.out.println("2 last digit:"+b);
			c=(a/1000)%10;
			System.out.println("2 digit :"+c);
        }
        
    }
}