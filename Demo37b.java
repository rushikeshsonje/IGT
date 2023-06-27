class Demo37b
{
    public static void main(String args[])
    {
          String name = "Vaishnavi";
          System.out.println(name.length());
                // name = null;NullPointerException
          System.out.println(name.length());

          int arr[] = {0,10,23,23,234};
          System.out.println(arr[4]);
                     //System.out.println(arr[5]);ArrayIndexOutOfBoundsException
     
          String num = "100";
          //String num = "100A";//NumberFormatException
          System.out.println(Integer.parseInt(num));
     }
} 