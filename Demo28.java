//***********Abstraction***********
// Tp hide data --like hide sop(ABC method)
// to provide body of that abstract class ---create other class B extend A 
// if normal class extends class abstract class method of abstract in that normal class
// if B having abstract then other C extends B and object of C created

abstract class A
{
    abstract void abc();
}
abstract class B extends A
{
    void abc()
    {
         System.out.println("ABC method");
    }
    abstract void xyz();
}
class C extends B
{
     void xyz()
     {
         System.out.println("XYZ method");
     }
}          
class Demo28
{
    public static void main(String args[])
    {
          //A a = new A();
          //B b = new B();
          //b.abc();
          
          C c = new C();
          c.abc();
          c.xyz();
    }
}
   