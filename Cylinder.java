//also section 13

public class Cylinder extends Circle
{
  private double height;
  
  public Cylinder()
  {
    super();
    height = 1.0;
  }
  
  public double getHeight()
  {
    return height;
  }
  
  public void setHeight(double h)
  {
    height = h;
  }
  
  public double findVolume()
  {
    return findArea() * height;
  }
}