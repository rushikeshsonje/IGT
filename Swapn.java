import java.util.Scanner;
class Swapn
{
     public static void main(String args[])
     { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A value");
             int a = sc.nextInt();
      
        System.out.println("Enter the B value");
             int b = sc.nextInt();
       
         a = a + b;
         b = a - b;
         a = a - b;
        System.out.println("After swapping:" + " a = " + a + ", b = " + b);
        
        
     }
}