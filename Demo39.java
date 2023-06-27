class A 
{
     int ss=0;
     int mm= 0;
     int hh = 0;
     void abc()

     {
      try
      {
           for(int i=0;i<=70;i++)
           {
                System.out.printf("mm"+ i++ "\r");//"\r"---to print change on single sine (only change no on lin)
                if (i==10)
                {
                    mm++;
                    i=0;
                }
                Thread.sleep(1000);
           }
      }
      catch(InterruptedException e)
       {
       }
     }
}
class Demo39
{

    public static void main (String args[])
    {
          A a = new A();
          a.abc();
    }
}