class A
{
    void abc()throws InvalidAgeException
   {
        for (int age = 1;age<=25; age++)
        {
           if(age==18) throw new InvalidAgeException("Please check age once again");
           if(age == 60)throw new MaxAgeException( " Max age exception occurs");
           System.out.println("Age " +age);
        }
   }
}


class Demo37
{
    public static void main(String args[])
    {
        try 
        { 
           A a = new A();
           a.abc();
        }
         catch(InvalidAgeException iae)
         {
              System.out.println(iae);
         }
         catch(MaxAgeException mae)
         {
              System.out.println(mae);
         }

     }
       
}
class InvalidAgeException extends Exception
//customException --own exception
{
      InvalidAgeException(String msg)
      {
             super(msg);
      }
}
class MaxAgeException extends Exception
//customException --own exception
{
      MaxAgeException(String msg)
      {
             super(msg);
      }
}
