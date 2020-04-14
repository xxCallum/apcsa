//NOT AN ASSIGNMENT

public class ArrayTest
{
  public static void main(String[] args)
  {
    int[] c = {1,3,5,6};
    System.out.println(c[2]);
    change(c);
    System.out.println(c[2]);
    
  }
  
  public static void change(int[] array)
  {
    array[2] = 100;
  }
}