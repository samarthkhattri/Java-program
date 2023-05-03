import java.util.Scanner;
class Wap
{
	public static void main(String args[])
	{
		char b;
		Scanner sd = new Scanner(System.in);
		System.out.println("ENTER A ALPHABHET");
		
		b=sd.next().trim().charAt(0);
		
		System.out.println(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'?"VOWEL":"CONSONENT");
	}
	
}


