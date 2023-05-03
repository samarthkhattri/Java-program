import java.util.Scanner;
class Assumption
{
    public static void main(String[] args)
    {
        int n,i=1,even=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ten number ");

        while(i<=10)
        {
            n = sc.nextInt();
            if (n % 2 != 0)
            {
                even = 0;

            }
            i++;
        }
        if(even==1)
            System.out.println("yes");
        else
            System.out.println("no");
        }
    }

