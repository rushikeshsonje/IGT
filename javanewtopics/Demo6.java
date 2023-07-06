import java.util.*;
import java.io.*;

class Demo6
{
    public static void main(String args[])

 

    {
        String line=null;
        try
        {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter File name ?");
        String fname = br.readLine();

 

        File f = new File(fname);
        if(f.exists())
        {
            BufferedReader fr = new BufferedReader(new FileReader(fname));
            while((line=fr.readLine())!=null)
            {
                System.out.println(line);
            }
}
         else
         {
                System.out.println("soory..! File is not Exists");
         }

        }
        catch(Exception e)
        {
        }
    }
}