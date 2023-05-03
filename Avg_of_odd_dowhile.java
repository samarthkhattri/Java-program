import java.util.Scanner;
class Avg_of_odd_dowhile
{
	public static void main(String args[])
	{
		int n, i=1,s=0,c=0;
		double avg =0.0;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter ten number");
		
	   do
	   {
		   n=sd.nextInt();
		   if(n%2!=0)
		   {
			   s=s+n;
			   c++;  
		   }
		   i++;
	   }while(i<=10);
	   avg=s/c;
	   System.out.println("avg="+avg);
	}
}
