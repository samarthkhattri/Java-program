import java.util.Scanner;
class Eve
{
	public static void main(String args[])
	{
		char ch;
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER A AlPHABHET");
		
		ch=x.next().trim().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'A':System.out.println("APPLE");
			        break;
			
			case 'b':
			case 'B':System.out.println("BANANA");
					break;
			case 'm':
			case 'M':System.out.println("MANGO");
					break;
			default : System.out.println("INVALID VALUE");
		}
	}
}
			
			