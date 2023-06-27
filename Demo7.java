//This
class A
{
    int a1 = 100;
    void abc(int a1)
    {
        System.out.println("Hii A class " + this.a1);// this use to access the class variable th. get 100
        System.out.println("Hii A class "+a1);// get assign value 1000
    }
    
}
class Demo7
{
    public static void main (String[] args) {
        A a = new A();
        a.abc(1000);
    }
}