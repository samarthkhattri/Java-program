import java.util.Scanner;
class Largest2
{
	public static void main(String args[])
	{
		int number1,number2,number3,largest=0;
		Scanner sa = new Scanner(System.in);
		
		System.out.println("Enter the First number: ");
		number1 = sa.nextInt();
		System.out.println("Enter the Second number: ");
		number2 = sa.nextInt();
		System.out.println("Enter the third number: ");
		number3 = sa.nextInt();
		
		if(number1>number2 && number1>number3)
			 largest = number1;
		 if(number2>number1 && number2>number3)
			 largest = number2;
		 if(number3>number1 && number3>number2)
			 largest = number3;
	
		
		System.out.println("\nLargest = " +largest);
	}
}	