import java.util.Scanner;
class Country_array                                
{
	public static void main(String[] args)
	{
		String a[] = {"NEW DELHI","WELLINGON","OTTAWA","CANBERRA","TOKOYO"};
		String b[] = {"INDIA","NEWZEALAND","CANDA","AUSTRALIA","JAPAN"};
		int i,index=0,fd=0;
		String search;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter country name");
		search=sd.nextLine();
		
		System.out.println("Country and capital");
		
		
		for(i=0;i<5;i++)
		{
			
			 if(search.equals(b[i]))
			 {
			 fd=1;
			 index=i;
			 break;
			 }
			
		}
		if(fd==1)
		{
			System.out.println(b[index]+"-"+a[index]);
		}
		else
		{
			System.out.println("Sorry not found");
		}
		
		
	}
}
		
		