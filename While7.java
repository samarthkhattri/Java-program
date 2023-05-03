import java.util.Scanner;  
class While7  
{  
    public static void main(String args[])  
    {   int i = 1;
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");       

            int num=sc.nextInt();  
            System.out.print("Enter range: ");       

            int range=sc.nextInt();  
                 
   
            while (i <= range)   
            {  
  
                System.out.println(num + " * " + i + " = "+ num * i);  
 
               i++;  
            }
        
    }  
}  