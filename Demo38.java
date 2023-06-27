//in thread sleep exception occurs handle by try catch
// we get result after 1000sac as we mention
// first I then J execute  5sec+ 5sec= 10 sec
// to decreace time do by extends threads by start and run

// multiprocessing--

class A extends Thread
{
     public void run()
     {
      try
      {
           for(int i=0;i<=10;i++)
           {
                System.out.println("  i :"+ i);
                Thread.sleep(1000);
           }
      }
      catch(InterruptedException e)
       {
       }
     }
}

class B extends Thread
{
     public void run()
     {
      try
      {
           for(int j=0;j<=10;j++)
           {
                System.out.println("      j :"+ j);
                Thread.sleep(1000);
           }
      }
      catch(InterruptedException e)
       {
       }
     }
}
class C extends Thread
{
     public void run()
     {
      try
      {
           for(int k=0;k<=10;k++)
           {
                System.out.println("        k :"+ k);
                Thread.sleep(1000);
           }
      }
      catch(InterruptedException e)
      {
      }
    }
}

class Demo38
{

    public static void main (String args[])
    {
          A a = new A();
          B b = new B();
          C c = new C();

          a.start();
          b.start();
          c.start();
     
     }
}

