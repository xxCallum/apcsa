
public class Polygon
{
  private int numSides;
  
  public Polygon()
  {
    numSides = 0;
  }
  public Polygon (int numSides)
  {
    this.numSides = numSides;
  }
  public String toString()
  {
    return "this polygon has " + numSides + " sides.";
  }
  public void setName (int numSides)
  {
    this.numSides = numSides;
  }
  public int getName()
  {
    return numSides;
  }
}