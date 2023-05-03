import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		int a,b,c;
		int r1,r2,r3,sum;
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter number:");
		
		a = sb.nextInt();
		b = sb.nextInt();
		c = sb.nextInt();
		
		r1=a%10;
		r2=b%10;
		r3=c%10;
		
		sum=(r1+r2+r3);
		
		System.out.println("Sum of last digit of 3 no. :"+sum);
		
	}
}	