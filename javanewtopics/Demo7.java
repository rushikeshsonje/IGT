import java.util.*;
import java.io.*;

class Demo7 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            File dir1 = new File("abc");
            dir1.mkdir();
            
            File dir2 = new File("xyz");
            dir2.mkdir();
            
            File f = new File(dir2, "atoz.txt");
            
            if(f.exists()) {
                System.out.println("file Exists...!");
                System.out.println("Please Enter some other file name : ");
                String fname = br.readLine();
                f = new File(dir2, fname);
                f.createNewFile();
                
            }
            else {
                f.createNewFile();

            }
            PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
            System.out.println("Enter Some Content..");
            pw.println(br.readLine());
            pw.close();

        } catch(Exception e) {
        }
    }
}