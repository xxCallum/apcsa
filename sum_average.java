//section 11 SUM/AVERAGE

public class sum_average
{
  public static void main(String[] args)
  {
    int[] c = {3,5,6,8,8,10,22};
    int sum = 0;
    Double avg = 0.0;
    
    for (int i : c)
    {
      sum += i;
      avg = ((double) sum) / c.length;
    }
    System.out.println(sum);
    System.out.println(avg);
  }
}
    