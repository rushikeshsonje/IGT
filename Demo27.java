// Acending order
import java.util.Scanner;
public class Demo27
{
  public static void main(String args[])
  {

     int arr[] = {4,2,5,67,3,6,3,56,6,88};
     int temp = 0;    //Temporary variable to store the element
        
         for (int i = 0; i < arr.length; i++)   //Holds each Array element
         {     
            for (int j = i+1; j < arr.length; j++)    //compares with remaining Array elements
            {     
               if(arr[i] > arr[j]) //Compare and swap
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
     System.out.println();    
            
          
        System.out.println("Elements of array sorted in Ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }  
       
 
  }
}