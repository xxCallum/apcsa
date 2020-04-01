//Section 10 circle area


public class CircleArea
{
  public static void main(String[] args)
  {
    System.out.println(calcArea(1));
  }
    public static double calcArea(int r)
    {
      return (Math.pow(r,2) * Math.PI);
    }
}