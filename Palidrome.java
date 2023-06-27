// Reverse the string and check palidrome
import java.util.Scanner;
class Palidrome
{
     public static void main(String args[])
     { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
       // String a = sc.next();
          
 
       char ch[]=str.toCharArray();  
       String rev="";  
       for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
      }  
      return rev;  
}  
}  
      