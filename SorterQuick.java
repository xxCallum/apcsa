
public class SorterQuick extends SorterBase {
  
  public SorterQuick(int n) { 
    super("Quick", n);
  }
  
  public void sort() {
    sortRange(0, getSize()-1);
  }
  
  // sort the elements from i=lo...hi (inclusive)
  public void sortRange(int lo, int hi) {
    int rangelength = hi - lo +1;
    if(rangelength ==0){
      return;
    }
    if(rangelength == 1){
      return;
    }
    if(rangelength == 2){
      if(indexLessThan(lo, hi)==false){
        indexSwap(lo,hi);
      }
    }
        
    // QuickSort is a 'recursive' sort; because this function calls itself.
    // Here's how it works. Copy out values at indices lo...hi into a temporary external array
    int[] copyarray = new int[rangelength];
    for(int copyi=0;copyi<rangelength;copyi++){
      int origini = lo+copyi;
      copyarray[copyi] = getNum(origini);
    }
    // Pick ay element of the temporary array (might as well be the first or last) to be the 'pivot'
    int pivot = copyarray[0];
    int lowestavail = lo;
    int highestavail = hi;
    // Go through the non-pivot elements of the temporary array,
    // Stick the less-than-pivot values back in the internal array, in positions lo, lo+1, lo+2, ...
    for(int i = 1; i<rangelength; i++){
      int currentval = copyarray[i];
      if(currentval < pivot){
        setNum(lowestavail,currentval);
        lowestavail +=1;
      }
    // Stick the more-than-pivot values back in the internal array, in positions hi, hi-1, hi-2, ...
      else{
        setNum(highestavail,currentval);
        highestavail -=1;
      }
    // When you're done there will be one spot left to put the pivot
    }
    setNum(lowestavail,pivot);
    // Now lo...hi is reordered into 3 groups, from left to right:
    // 1. less-than-pivot 
    // 2. then the  pivot (group of one)
    // 3. more-than-pivot 
    // The pivot is EXACTLY where it belongs in the final ordering (why?)
    // Groups 1 and 3 are also occupying the ranges they should occupy in the final ordering (why?),
    // but out of order in those ranges.
    // The secret sauce is, at the end of this function sortRange() we call this same function sortRange() -- 
    // twice; once each for the sub-ranges that define groups 1 and 3.
    sortRange(lo,pivot-1);
    sortRange(pivot+1,hi);
    // VERY important for recursive functions: you MUST protect against infinite recursion by opening the
    // function by handling the appropriate 'base cases', like what if the range includes only 1 or 2 numbers? 
    // Or even what if the range includes 0 numbers?
    
    // I have set this up so that the range lo,hi is inclusive (on both ends), and the main sort() function
    // calls sortRange(0, getSize()-1); If it works better for the way you want to think about it, feel
    // free to redefine it more java-style, like sortRange(int first_index, int last_index_plus_one), 
    // in which case you would change the main function to sortRange(0, getSize())
  }
 
}
