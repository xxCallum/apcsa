//NOT AN ASSIGNMENT

public class Course
{
  private String name;
  
  public Course()
  {
    name = "";
  }
  public Course (String name)
  {
    this.name = name;
  }
  public void setName (String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public void printName()
  {
    System.out.println("Welcome to " + name);
  }
}