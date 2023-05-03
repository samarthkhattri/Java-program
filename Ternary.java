import java.util.Scanner;
class Ternary
{
	public static void main(String args[])
	{
		int a;
		Scanner ds = new Scanner (System.in);
		System.out.println("Enter the number");
		
		a=ds.nextInt();
		
	
		
		System.out.println(a>0 ? "positive" : a<0 ? "negative" : "equal to zero");
	}
}
