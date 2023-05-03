import java.util.Scanner;
class Equal
{
	public static void main(String args[])
	{
		int a,b,c,d2;
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter a integer");
		a=a1.nextInt();
		
		if(a>=1000 && a<=9999)
		{
			b=a/100;
			c=a%100;
			d2=b+c;
			System.out.println("sum:"+d2);
		}
		else
			System.out.println("Not a four digit number");
	}
	
}	