//reduce memory in constructor overloading------using this
class Draw
{
    Draw()
    {
        this(1000);
        System.out.println(" Draw()");
    }
    
    Draw(int a )
    {
        this(100,200);
        System.out.println(" Draw() area of  square "+ (a * a ));
    }
 

    Draw(int l, int b)
    {
        System.out.println(" Draw() area of Rectanlge "+ (l*b));
    }
}
class  Demo18
{
    public static void main(String args[])
    {
         Draw d1= new Draw();
        //Draw d2= new Draw(10);
        //Draw d3= new Draw(10,20);//without creating this we can call this only one object

    }    
}