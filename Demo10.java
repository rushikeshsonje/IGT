import java.util.Scanner;
class clerk
{
    int id;String name ; int age;int salary; String desig;
    clerk()
    {
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID ?");
		id=sc.nextInt();

		System.out.print("Enter the Name ?");
		name=sc.next();
		
		System.out.print("Enter the age ?");
		age=sc.nextInt();
		
		System.out.print("Enter the salary ?");
		salary=sc.nextInt();
		
		System.out.print("Enter the desig ?");
		desig=sc.next();  
    }
    
    void display()
    {
        
        System.out.println("id "+id); 
        System.out.println("name "+name); 
        System.out.println("age "+age);
        System.out.println("salary "+salary); 
        System.out.println("desig "+desig); 
        
    }
}

class Dev
{
    int id;String name ; int age;
    int salary; String desig;
    Dev()
    {
        
       Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the ID ?");
		id=sc.nextInt();

		System.out.print("Enter the Name ?");
		name=sc.next();
		
		System.out.print("Enter the age ?");
		age=sc.nextInt();
		
		System.out.print("Enter the salary ?");
		salary=sc.nextInt();
		
		System.out.print("Enter the desig ?");
		desig=sc.next();  
    }
    
    void display()
    {
        
        System.out.println("id "+id); 
        System.out.println("name "+name); 
        System.out.println("age "+age);
        System.out.println("salary "+salary); 
        System.out.println("desig "+desig); 
        
    }
}
    
class manager
{
    int id;String name ;int age;int salary; String desig;
    manager()
    
    {
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID ?");
		id=sc.nextInt();

		System.out.print("Enter the Name ?");
		name=sc.next();
		
		System.out.print("Enter the age ?");
		age=sc.nextInt();
		
		System.out.print("Enter the salary ?");
		salary=sc.nextInt();
		
		System.out.print("Enter the desig ?");
		desig=sc.next();  
    }
    
    void display()
    {
        
        System.out.println("id "+id); 
        System.out.println("name "+name); 
        System.out.println("age "+age);
        System.out.println("salary "+salary); 
        System.out.println("desig "+desig); 
        
    }
}
class tester
{
    int id;String name ; int age;int salary; String desig;
    tester()
    
    {
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID ?");
		id=sc.nextInt();

		System.out.print("Enter the Name ?");
		name=sc.next();
		
		System.out.print("Enter the age ?");
		age=sc.nextInt();
		
		System.out.print("Enter the salary ?");
		salary=sc.nextInt();
		
		System.out.print("Enter the desig ?");
		desig=sc.next();  
    }
    
    void display()
    {
        
        System.out.println("id "+id); 
        System.out.println("name "+name); 
        System.out.println("age "+age);
        System.out.println("salary "+salary); 
        System.out.println("desig "+desig); 
        
    }
}
class Demo10.java
{
    public static void main (String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println(" 1) Clerk"); 
            System.out.println(" 2) Manager"); 
            System.out.println(" 3) Dev"); 
            System.out.println(" 4) tester"); 
        
            System.out.println("Enter choices"); 
              int ch = sc.nextInt();
              if(ch==1)
             {
                clerk c = new clerk();// try to create once
                c.display();
        
             }
              else if(ch==2)
             {
               Dev d = new Dev();
               d.display();
            
             }
              else if(ch == 3){
                 manager m = new manager();
                 m.display();
            
             }
               else if (ch == 4){
                 tester t = new tester();
                 t.display();
            
             }
        }while(ch<=4);
        
        
    }
}