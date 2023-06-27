// constructor overloading
class Emp{
    Emp(int id, String name, int Salary)
    {
        System.out.println("perfect Hr");
    }
    Emp(int id, String name, String Project, String loc )
    {
         System.out.println("perefect manager");
    }
    
    
}
class Demo17
{
    public static void main (String[] args) {
        Emp a = new Emp(100,"as",211);
        Emp a1 = new Emp(100,"ass","as","add");
        //A a2 = new A(10,"sa");
        
        
    }
}