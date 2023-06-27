// program - max  2 number
import java.util.Scanner;
class B
{
    int a;int b;
    B()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");  
        a=sc.nextInt();  
        System.out.println("Enter the second number:");  
        b=sc.nextInt();  
        
    }
    void abc()
    {
        
        if (a >= b )
         System.out.println( a + " is the maximum number.");
        else
         System.out.println( b + " is the maximum number.");
        
    }
}

class Demo23 {
    public static void main (String[] args) {
        
        
        B b1 = new B();// try to create once
        b1.abc();
    }
}