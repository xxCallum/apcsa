public class MultPractice implements StudyPractice{
  
  private int base;
  private int produce;
  
  public MultPractice(int i, int j){
    base = i;
    produce = j;
  }
  
  public String getProblem(){
    return (base + " times " + produce);
  }
  
  public void nextProblem(){
    produce +=1;
  }
}

  