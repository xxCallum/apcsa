//multiply.java


import java.util.Scanner; //import scanner class from java class libraries

public class multiply
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //variable declaration for a Scanner object
    
    int n1; //first number
    int n2; //second number
    int n3; //third number
    int prod; //product of first, second, and third numbers
    
    System.out.println("Enter the first number: ");
    n1 = input.nextInt(); //get first number
    
    System.out.println("Enter the second number: ");
    n2 = input.nextInt(); //get second number
    
    System.out.println("Enter the third number: ");
    n3 = input.nextInt(); //get third number
    
    prod = n1 * n2 * n3; //get product by multiplying the 3 numbers
    
    System.out.println("The product is " + prod + ".");
  }
}