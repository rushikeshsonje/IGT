// min in array
import java.util.Scanner;

public class Demo25
{
  public static void main(String args[])
  {

     int arr[] = {4,2,5,67,3,6,3,56,6,88};

     int min = arr[0];

     for(int i=0; i<arr.length; i++)
     {
       if(min > arr[i])
       {
          min = arr[i];
       }

     }

    System.out.print(min); 
  }
}