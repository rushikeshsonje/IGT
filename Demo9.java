//Inheritance
class Parent
{
    int site = 5;
    int money = 40000;
    String car = "BMW";
    
}
class Child extends Parent
{
    int money  = 100;
    void use()
    {
        System.out.println(" site"+ site);
        System.out.println(" child money"+ money); 
        System.out.println(" parent money"+ super.money);
        System.out.println(" both"+( super.money+ money));
        System.out.println(" car"+ car);
    }
}

class Demo9
{
    public static void main (String[] args) 
    {
        Child c = new Child();
        c.use();
    }
}