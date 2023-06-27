//super 
class A
{
    int a1 = 1000;
    
}
class B extends A{// must have to extends
    int a1 = 100;
    void xyz(int a1)
    {
        System.out.println(" B class"+ a1);
        System.out.println(" B class"+ this.a1); // access class vaiable
        System.out.println(" B class"+ super.a1);// access vaiable of other class
        
    }
}

class Demo8
{
    public static void main (String[] args) {
        B b = new B();
        b.xyz(10);scsc.nextInt
    }
}
//output-10
100
1000