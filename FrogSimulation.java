import java.util.Random;

public class FrogSimulation
{
  private int goalDistance;
  private int maxHops;
  public FrogSimulation(int dist, int numHops)
  {
    goalDistance = dist;
    maxHops = numHops;
  }
  private int hopDistance(){
      Random ran = new Random();
      int hopDistance = ran.nextInt(20)-10;
      //System.out.println(hopDistance);
      return hopDistance;
  }
  public boolean simulate(){
    int pos = 0;
    for(int numHops=0; numHops<maxHops; numHops++){
      int distanceHopped = hopDistance();
      pos += distanceHopped;
      if(pos<0){
        //System.out.println(pos);
        return false;
      }
      else if(pos>=goalDistance){
        //System.out.println(distanceHopped);
        return true;
      }
      else if(numHops==maxHops-1 && pos<goalDistance){
        //System.out.println(maxHops);
        return false;
      }
    }
    return false;
  }
  public double runSimulations(int num){
    double percent = 0;
    int attempt = 0;
    int success = 0;
    for(int i=0; i<num; i++){                                             //for loop to simulate num times
      attempt +=1;                                           //counter for attempts
      if(simulate() ==true){                                            // counter for successes
        success += 1;
      }
      percent = (success*1.0)/attempt;                             //math
      int realpercent = (int) (percent * 100);
      System.out.println(success + "/" + attempt + " = " + realpercent + "%");
    }
    return percent;
  }
}