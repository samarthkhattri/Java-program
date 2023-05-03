import java.util.Scanner;
class SUM_OF_EVEN_NO
{
    public static void main(String args[])
	{
	     int i=1,s=0;
		 
		 do
		 {
		    if(i%2==0)
			{
				
			 s=s+i;
			}
			 i++;
		 }while(i<=100);
		 
		 System.out.println("Sum="+s);
	}
}