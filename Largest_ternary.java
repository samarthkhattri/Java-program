import java.util.Scanner;
class Largest_ternary 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = s.nextInt();
        b = s.nextInt();
		c = s.nextInt();
        
         
        System.out.println(a>b && a<c?"LARGEST="+a:b>a && b>c?"LARGEST="+b:"LARGEST="+c);
    }
}