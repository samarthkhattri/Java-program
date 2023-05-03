import java.util.Scanner;
class Name_array
{
	public static void main(String args[])
	{
		String a[] = new String[10];
		int i,pos=0,fd=0;
		String search;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter 10 name");
		
		for(i=0;i<10;i++)
		{
			a[i]=sd.nextLine();
		}
		System.out.println("enter name to be entered");
		search=sd.nextLine();
		
		for(i=0;i<10;i++)
		{
			
			 if(search.equals(a[i]))
			 {
			 fd=1;
			 pos=i+1;
			 break;
			 }
		}
		
		if(fd==1)
		{
			System.out.println("Name which is need:"+pos);
		}
		else
		{
			System.out.println("Name not found");
		}
	}
}
		
		
		
		