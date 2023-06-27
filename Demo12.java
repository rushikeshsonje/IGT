//default class
class A
{
    A()
    {
        System.out.println(" A class");
    }
    
}
class B extends A// must have to extends
{
    B()
        {
            System.out.println(" B class");
        }
}


class Demo12
{
    public static void main (String[] args)
    {
        B b = new B();//automatically called pared class ---default constructor
        
    }
}