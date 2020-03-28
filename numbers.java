import java.util.Scanner;

public class numbers
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner( System.in );
    int num;
    
    System.out.println("Enter an integer: ");
    num = s.nextInt();
    
    if (num >= 100)
    {
      System.out.println("Your number is big.");
    }
    else
    {
      System.out.println("Your number is small.");
    }
  }
}