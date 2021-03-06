
public class SorterBubble extends SorterBase {
  
  public SorterBubble(int n) { 
    super("Bubble", n);
  }
  
  public void sort() {
    for(int j=0; j<getSize(); j++){
      for(int i = 0; i<getSize()-1; i++){
        if (indexLessThan(i,i+1)){}
        else{
          indexSwap(i,i+1);
        }
      }
    }
    // Implement bubble sort
    // Starting by considering internal values 0 and 1 to be in a 'bubble', swap them if they are out of order.
    // Then bubble 1 and 2, then 2 and 3, ... and let the 'bubble' bubble all the way to the end
    // Repeat, until the whole array is sorted (how many iterations will that take?)
  }

  
}
