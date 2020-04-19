//section 13 ASSIGNMENT

public class Circle
{
  private double radius;
  
  public Circle()
  {
    radius = 1.0;
  }
  
  public double getRadius()
  {
    return radius;
  }
  
  public void setRaidus(double r)
  {
    radius = r;
  }
  
  public double findArea()
  {
    return radius*radius*Math.PI;
  }
}