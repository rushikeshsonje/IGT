// max in array
import java.util.Scanner;

public class Demo2
{
  public static void main(String args[])
  {

     int arr[] = {1,4,2,5,67,3,6,3,56,6,88};

     int max = arr[0];

     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
          max = arr[i];
       }

     }

    System.out.print(max); 
  }
}