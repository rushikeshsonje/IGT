class A
{
    A()
    {
        System.out.println("A class");
    }
    void abc()
    {
        System.out.println("abc methods.....");
        
    }
}

class Demo6 {
    public static void main (String[] args) {
        A a = new A();// try to create once
        a.abc();// many methods can created
        a.abc();
    }
}