import java.util.Scanner;
class Alphabhet
{
	public static void main(String args[])
	{
		char a;
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the alphabhet");
		a=cs.next().charAt(0);
		
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		{
			System.out.println("entered value is vowel");
		}

		
		else
			System.out.println("entered value is consonant");
	}
}	