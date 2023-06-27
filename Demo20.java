// overriding
class Bank
{
    public int loan()
    {
        return 8;
    }
    
}
class SBI extends Bank
{
}
class Axis extends Bank
{
    public int loan()
    {
        return 10;// same method name but different implementation in child class...over riding
        
    }
}    
    
class Demo20
{
    public static void main (String[] args) 
    {
        SBI s = new SBI();
        System.out.println(s.loan()+"%");
        
        Axis a = new Axis();
        System.out.println(a.loan()+"%");
    }
    
}