//assignment BiggerOne program

import java.util.Scanner;


public class BiggerOne
{
  public static void main(String[] args)
  {
    int n1;
    int n2;
    Scanner s = new Scanner( System.in );
    
    System.out.println("Enter an integer: ");
    n1 = s.nextInt();
    System.out.println("Enter a second integer: ");
    n2 = s.nextInt();
    
    System.out.println("The bigger number is: " + findbigger(n1,n2) + ".");
    }
  private static int findbigger(int n1, int n2)
  {
    if (n1>n2)
    {
      return n1;
    }
    else if (n2>n1)
    {
      return n2;
    }
    else
    {
      return n1;
    }
  }
}