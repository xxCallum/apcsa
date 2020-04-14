//ASSIGNMENT SECTION 12

import java.util.ArrayList;

public class posOrNeg
{
  public static void main(String[] args)
  {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(3);
    x.add(-5);
    x.add(10);
    x.add(-10);
    x.add(13);
    
    int neg = 0;
    
    for(int i = 0; i < x.size(); i++)
    {
      if(x.get(i) < 0)
      {
        neg++;
      }
    }
    System.out.println(neg);
  }
}