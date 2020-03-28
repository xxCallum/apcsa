import java.util.Scanner;

public class oddnumbers
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    
    int num1;
    int num2;
    
    System.out.println("enter an integer: ");
    num1 = s.nextInt();
    
    System.out.println("enter another larger integer: ");
    num2 = s.nextInt();
   
    for (int i = num1; i < num2; i++)
    {
      if (i % 2 == 1)
      {
        System.out.println(i);
      }
    }
  }
}