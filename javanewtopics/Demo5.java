import java.util.*;
import java.io.*;

class Demo5 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter Id : ");
            int id = Integer.parseInt(br.readLine());
            
            System.out.println("Enter First name: ");
            String fname = br.readLine();
            System.out.println("Enter last name: ");
            String lname = br.readLine();
            
            System.out.println("id is :" +id);
            System.out.println("first name is : "+ fname);
            System.out.println("last name is : "+ lname);

        } catch(Exception e) {
        }
    }
}