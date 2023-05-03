import java.util.Scanner;
class SPY_DOWHILE
{
	public static void main(String args[])
	{
		int n,temp=0,s=0,p=1;
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter A Number");
		n=sd.nextInt();
		
		do
		{
			temp=n%10; //123
			s=s+temp;   // 0=0+3
			p=p*temp;   // 1=1*3
			n=n/10;     // 3/10 3cut 
		}while(n>0);
		
		if(p==s)
		System.out.println ("Spy Number");
		else
		System.out.println("Not a Spy Number");
	}
}
