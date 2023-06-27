import java.util.Scanner;
class A
{
    int a;int b; int c;
    A()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");  
        a=sc.nextInt();  
        System.out.println("Enter the second number:");  
        b=sc.nextInt();  
        System.out.println("Enter the third number:");  
        c = sc.nextInt();  
    }
    void abc()
    {
        
        if (a >= b && a >= c)
         System.out.println( a + " is the maximum number.");
        else if (b >= a && b >= c)
         System.out.println( b + " is the maximum number.");
        else
         System.out.println( c + " is the maximum number.");
        
    }
}

class Demo22 {
    public static void main (String[] args) {
        
        
        A a = new A();// try to create once
        a.abc();
    }
}