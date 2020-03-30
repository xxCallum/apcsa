//assignment dayname program

import java.util.Scanner;

public class dayName
{
  public static void main(String[] args)
  {
    int daynum;
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Enter a number from 1-7.");
    daynum = s.nextInt();
    
    String result = getName(daynum);
    System.out.println(result);
  }
    
    
  private static String getName( int dayNumber)
  {
    if (dayNumber==1)
    {
      return "Sunday";
    }
    else if (dayNumber==2)
    {
      return "Monday";
    }
    else if (dayNumber==3)
    {
      return "Tuesday";
    }
    else if (dayNumber==4)
    {
      return "Wednesday";
    }
    else if (dayNumber==5)
    {
      return "Thursday";
    }
    else if (dayNumber==6)
    {
      return "Friday";
    }
    else if (dayNumber==7)
    {
      return "Saturday";
    }
    else
    {
      return "you didn't enter a number between 1 and 7. for shame";
    }
  }
}


        