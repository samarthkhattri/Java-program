import java.util.Scanner;
class Time1
{
	public static void main(String args[])
	{
		int hr=0,min=0,sec=0;
		int total;
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter Time in Hr:");
		hr = sb.nextInt();
		System.out.println("Enter Time in Min:");
		min = sb.nextInt();
		System.out.println("Enter Time in Sec:");
		sec = sb.nextInt();

		hr=(hr*3600);
		min=(min*60);
		
		total=(hr+min+sec);
	
		System.out.println("Total seconds :"+total);

		
		
	}
}	
	