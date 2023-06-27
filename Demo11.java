// program - max number
import java.util.Scanner;
class A
{
    int a;int b; int c;
    A()
    {
        System.out.println("A class");
    }
    void abc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");  
        a=sc.nextInt();  
        System.out.println("Enter the second number:");  
        b=sc.nextInt();  
        System.out.println("Enter the third number:");  
        c = sc.nextInt();  
    
        if (a >= b && a >= c)
         System.out.println( a + " is the maximum number.");
        else if (b >= a && b >= c)
         System.out.println( b + " is the maximum number.");
        else
         System.out.println( c + " is the maximum number.");
        //System.out.println("abc");
    
    }
}

class Demo11 {
    public static void main (String[] args) {
        
        
        A a = new A();// try to create once
        a.abc();
        a.abc();
        a.abc();// many methods can created
        
    }
}