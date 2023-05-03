import java.util.Scanner;
class Sevenwonder_array
{
	public static void main(String args[])
	{
		String a[] = {"CHICHEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA COLOSSEUM"};
		String b[] = {"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
		int i,index=0,fd=0;
		String search;
		Scanner sd = new Scanner (System.in);
		System.out.println("Enter country name");
		search=sd.nextLine();
		
		System.out.println("");
		
		
		for(i=0;i<7;i++)
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
		
		