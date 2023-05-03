import java.util.Scanner;
class SUM_OF_TEN_NO
{
	public static void main(String args[])
	{
		int n,i=1,s=0;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter Ten no");
		
		 
		 
		 do
		 {
			 n= sd.nextInt();
			 s=s+n;
			 i++;
		 }while(i<=10);
			 
		 System.out.println("Sum="+s);
	}
}
		 