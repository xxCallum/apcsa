import java.util.Scanner;

public class numbers2
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner( System.in );
    int num;
    
    System.out.println("Enter an integer: ");
    num = s.nextInt();
    
    if (num > 0)
    {
      System.out.println("Your number is positive.");
    }
    else if (num == 0)
    {
      System.out.println("Your number is 0.");
    }
    else
    {
      System.out.println("Your number is negative.");
    }
  }
}