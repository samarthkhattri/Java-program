import java.util.Scanner;
class Multipleof5
{
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner cv = new Scanner(System.in);
		System.out.println("ENTER A INTEGER");
		a=cv.nextInt();
		
		if(a>=10000 && a<=99999)
		{
			b=(a/100)%10;
			c=a%10;
			d=b+c;
			
			if(d%5==0)
				System.out.println("Multiple of 5");
			else
				System.out.println("not a multiple of 5");
		}
		else
			System.out.println("not a 5 digit no.");
	}
}	