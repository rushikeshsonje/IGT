/*import java.util.*;
class Demo36
{
      public static void main(String args[])throws FileNotFoundException
      {
          m1();
      }
      static void m1()throws FileNotFoundException
      {
         m2();
         System.out.println("M1 method");
      }
      static void m2()throws FileNotFoundException
      {
         m3();
         System.out.println("M2 method");
      }

      static void m3()throws FileNotFoundException
      {
           File f = new File("abc.txt");
           FileReader fr = new FileReader(f);
       }
}
//throws 
// to handle the checked the exception
// so better allows use try and catch   
*/ 
import java.util.*;
import java.io.*;
class Demo36
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
           try{

                File f = new File("abc.txt");
                FileReader fr = new FileReader(f);
           }

           catch(FileNotFoundException e)
           {
             System.out.println("Something went wromng"); 
           }
           finally
           {
              System.out.println("Thank you");
           }
       }
}     