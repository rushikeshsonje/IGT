//Encapsulation--hide data into single unit by setter and getter method

class A {
      private int id;

      private String name;
      private int age;

      void setId(int id) //set the value
      {
          this.id = id;
       }
      int getId()
      {
          return id;
      }

      //void setName(String name) //set the value
     // {
      //    this.name = name;// error at string check------==--=---
     //  }
      //String getName()
      //{
      //    return name;
     // }
     
      void setAge(int age) //set the value
      {
          this.age = age;
       }
      int getAge()
      {
          return age;
      }

}
class Demo33
{
     public static void main(String args[])
     {
           A a = new A();
           a.setId(100);
           System.out.println(a.getId());

           //a.setName("Vaishnavi");
          // System.out.println(a.setName());
    
           a.setAge(10);
           System.out.println(a.getAge());
      }

}