// final and private use

class Car
{
       final int speed = 200;// if we donts want to anyone change speed value make final
       final void run()
       {
            System.out.println("Hello speed 200");

       }
}
class Maruti extends Car
{
       //void run()
      // {
       //    System.out.println(" speed 2000");
      // }
}
class Demo32
{
       public static void main(String args[])
       {
             Car c = new Car();
             c.run();
             System.out.println("speed"+c.speed);
             //c.speed = 20000;
            // System.out.println("speed"+c.speed);

             Maruti m = new maruthi();
             m run();
            
        }
}     