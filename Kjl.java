import java.util.Scanner;
class Kjl
{
	public static void main(String args[])
	{
		int a=10;
		Scanner s = new Scanner(System.in);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		a=s.nextInt();
		
		System.out.println("value:-"+a);
		
	}
}