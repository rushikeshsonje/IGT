interface University
{
       void exam();
       void result();
}
class IITB implements University
{
       public void exam()
       {// online 
          System.out.println("Online Exam") ;
       }
       public void result()
       {//offline
       }
}
class IITD implements University
{
       public void exam()
       { 
          
       }
       public void result()
       {//offline
       }
}
class IITM implements University
{
       public void exam()
       {// online 
       }
       public void result()
       {//offline
       }
}

class Demo35
{
       public static void main (String args[])
       {
         IITB a = new IITB();
         a.exam();
         a.result();
   
        //create a obj for class and print
         
       }
}