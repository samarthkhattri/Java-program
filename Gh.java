import java.util.Scanner;
class Gh
{
  public static void main(String args[])
  {
    double n,f;
	Scanner s1 = new Scanner(System.in);
	System.out.println("ENTER THE UNIT CONSUMED");
	
	 n= s1.nextDouble();
	
	if(n>=100)
	{
		f=n*2.00d+200;
		System.out.println("CHARGE"+f);
	}
	else if(n>=101 && n<=200)
	{
	    f=n*1.80d+200;
		System.out.println("CHARGE"+f);
	}
	else (n>200)
	{
		f=n*1.50d+200;
		System.out.println("CHARGE"+f);
	}
  }
}  