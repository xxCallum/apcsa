//comparison.java

import java.util.Scanner; 

public class comparison
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in); //scanner variable dec
    
    double n1;
    double n2;
    
    System.out.println("Enter the first number: ");
    n1 = s.nextDouble();
    
    System.out.println("Enter the second number: ");
    n2 = s.nextDouble();
    
    System.out.println("Is 1st number equal to 2nd number: " + (n1 == n2) + ".");
    System.out.println("Is 1st greater than or equal to 2nd number: " + (n1 >= n2) + ".");
    System.out.println("Is 1st number less than 2nd number: " + (n1 < n2) + ".");
  }
}
