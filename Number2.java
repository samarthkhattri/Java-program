import java.util.Scanner;
class Number2
{
    public static void main(String args[])
    {
        int a,b,c;
        int r1,r2,r3,sum;
		Scanner watch = new Scanner(System.in);
		System.out.println("Enter the value: ");
		
		a = watch.nextInt();
		b = watch.nextInt();
        c = watch.nextInt();
 
        r1=a%10;
		r2=b%10;
		r3=c%10;
		
		sum=(r1+r2+r3);
		
		System.out.println("Sum of last digit of all 3 number: "+sum);
	}
}	
	