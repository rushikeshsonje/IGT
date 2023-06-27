// Interface 
interface I
{ 
    int a=10;
    void add();
    void sub(); 
}
interface J
{
    int b=20;
    void mul();
    void div();

}
interface K extends I,J
{
    
}
class Cal implements K
                      // cal overide to all the 4 methods---yes as k extends Iand J
                      // compulsory overide all methods (as get error)
{
     public void add()
     {
         System.out.println(I.a + J.b);
     }
     public void sub()
     {
         System.out.println(I.a - J.b);
     }
     public void mul()
     {
         System.out.println(I.a * J.b);
     }
     public void div()
     {
         System.out.println(I.a / J.b);
     }


   
}
class Demo30
{
    public static void main(String args[])
    { 
        System.out.println("============cal===================");
        Cal c = new Cal();
        c.add();
        c.sub();
        c.mul();
        c.div();

        System.out.println("============Interfce I ===================");
        I i = c;
        c.add();
        c.sub();
        //c.mul();
        //c.div();

        System.out.println("============Interface J===================");
        J j = c;
        //c.add();
        //c.sub();
        c.mul();
        c.div();

        System.out.println("============cal===================");
        K k = c;
        c.add();
        c.sub();
        c.mul();
        c.div();      
    }

}     