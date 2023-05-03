import java.util.Scanner;
class All_Even
{
    public static void main(String[] args)
    {
        int n,temp=0,even=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
		
        while(n>0)
        {
            temp=n%10;
			
            if (temp % 2 != 0)
            {
                even = 0;

            }
			n=n/10;
            
        }
        if(even==1)
            System.out.println("yes");
        else
            System.out.println("no");
        }
    }

