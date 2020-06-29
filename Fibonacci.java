//section 15 recursion tingz pt2

public class Fibonacci
{
  public static void main(String[] args)
  {
    int num = 20;
    int[] series = new int[num];
    
    series[0] = 0;
    series[1] = 1;

    for ( int i = 2; i < num; i++ )
    {
      series[i] = series[i-1] + series[i-2];
    }

    System.out.println("Fibonacci Series of " + num + " numbers!");
    for ( int i = 0; i < num; i++ )
    {
      System.out.print( series[i] + " " );
    }
  }
}