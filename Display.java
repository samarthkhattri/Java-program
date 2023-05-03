import java.util.*;
class Display
{
    public static void main(String arr[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if (n>=10000 && n<=99999)
        {
            m=(n/100)%10;
            System.out.println("Central digit:"+m);
        }
        else
            System.out.println("Not a 5 digit number");
    }
}