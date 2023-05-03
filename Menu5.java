import java.util.Scanner;
class Menu5
{
	public static void main(String args[])
	{
		int ch,a;
		int b;
		Scanner sd = new Scanner(System.in);
		System.out.println("1.BUZZ NO. OR NOT");
		System.out.println("2.SPECIAL NO. OR NOT");
		
		ch=sd.nextInt();
	
        switch(ch)
		{
			case 1 : System.out.println("ENTER A VALUE");
			a = sd.nextInt();			
			System.out.println(a%7==0?"BUZZ NO.":"NOT A BUZZ NO");
			break;
			
			case 2 : System.out.println("ENTER A VALUE");
			b = sd.nextInt();
            			
			System.out.println(b ? " sp. no.":"not" );
			break;
		}
	}
}
			



	
	
