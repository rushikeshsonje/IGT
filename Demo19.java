class A{
    public void display()
    {
        System.out.println("hii");
    }
    
}
class B extends A
{
    public void display()
    {
        System.out.println("heloooo");// same method name but different implementation in child class...over riding
        
    }
    
}
class Demo19
{
    public static void main (String[] args) 
    {
        B b = new B();
        b.display();
    }
    
}