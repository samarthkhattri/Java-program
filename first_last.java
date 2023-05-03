import java.util.Scanner;
class first_last
{
	public static void main(String args[])
	{
		int num;
		int r1,r2;
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter number:");
		
		num = sb.nextInt();
		r1=num%10;
		r2=num/1000;
		
		System.out.println("last digit :"+r1);
		System.out.println("first digit :"+r2);

		
		
	}
}	