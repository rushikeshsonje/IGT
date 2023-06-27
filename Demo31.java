// static use
class A
{
      static int x = 10;
      static void abc()
      {
            System.out.println("hello abc method");

      }
}
class Demo31
{
      public static void main(String args[])
      {
              //A a = new A();// as memory wasted so we create static
              //a.abc();
              //sop("X"+a.x);
              A.abc();
              System.out.println("X:"+A.x);
      }
}