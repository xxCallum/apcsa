//section 10 roll dice (might use for dnd, might add function to ask how many sides too)

public class rollDie
{
  public static void main(String[] args)
  {
    int x = (int) (Math.random()*6)+1;
    System.out.println("you rollled " + x);
  }
}