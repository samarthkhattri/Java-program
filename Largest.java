import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
		int number1,number2,largest;
		Scanner sa = new Scanner(System.in);
		
		System.out.println("Enter the First number: ");
		number1 = sa.nextInt();
		System.out.println("Enter the Second number: ");
		number2 = sa.nextInt();
		
		if(number1>number2)
			 largest = number1;
		else
			largest = number2;
		
		System.out.println("\nLargest = " +largest);
	}
}	