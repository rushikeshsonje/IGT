// constructor overloading
class A{
    A()
    {
        System.out.println("A() cons");
    }
    A(int i )
    {
         System.out.println("int i cons");
    }
    A(int i, String name)
    {
         System.out.println("int i and name");
    }
    
    
}
class Demo15
{
    public static void main (String[] args) {
        A a = new A();
        A a1 = new A(100);
        A a2 = new A(10,"sa");
        
        
    }
}