//NOT AN ASSIGNMENT

public class CourseTest
{
  public static void main(String[] args)
  {
    Course algebra2 = new Course("Algebra 2");
    Course geometry= new Course("Algebra 2");
    algebra2 = geometry;
    
    System.out.println( algebra2.equals(geometry));
  }
}