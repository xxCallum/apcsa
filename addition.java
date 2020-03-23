// addition.java

import java.util.Scanner; //import scanner class from java class libraries

public class addition
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //variable declaration for a Scanner object
    
    int n1; //first number
    int n2; //second number
    int sum; //sum of first and second numbers
    
    System.out.println("Enter the first number: ");
    n1 = input.nextInt(); //get 1st number
    
    System.out.println("Enter the second number: ");
    n2 = input.nextInt(); //get second number
    
    sum = n1 + n2; //get sum by adding the 2 numbers
    
    System.out.println("The sum is " + sum + ".");
  }
}
