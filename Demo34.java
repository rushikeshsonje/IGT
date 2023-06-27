//*********Exception Handling******************

// call from M3 to M1
//if value is 0 for A or B (a/b) arthimatic exception-- handle by try and catch
// without terminating in between handle exception and continue prg

import java.util.*;
class Demo34
{
      public static void main(String args[])
      {
          m1();
      }
      static void m1()
      {
         m2();
         System.out.println("M1 method");
      }
      static void m2()
      {
         m3();
         System.out.println("M2 method");
      }

      static void m3()
      {
         System.out.println("M3 method");
         Scanner sc = new Scanner(System.in);
         try
         {
                 System.out.println("Enter the A value");
                 int a = sc.nextInt();
      
                 System.out.println("Enter the B value");
                 int b = sc.nextInt();
              
                 int c = a/b;
                 System.out.println("Result is"+c);
         }
          catch(ArithmeticException ae)
           {
                 System.out.println("Hello we cant divide anything by zero");
           }
    
           catch(InputMismatchException ime)
           {
                 System.out.println("Hello please enter the number only");
           }
     }
}
                 
                 

         
    
         

