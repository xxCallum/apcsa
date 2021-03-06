import java.util.Random;

public abstract class SorterBase {
  
  public int[] array;
  private String name;
  private int length;
  private int counterget;
  private int counterset;  
  private int counterswap;
  private int countercompare;

  // declare member variables here
  // make them all private, and access them only through the accessors below
  
  public SorterBase(String a, // the name of the sort algorithm, for print()
                    int n)    // size of internal array 
  {
    name = a;
    newScramble(n);
    
    // populate an internal array of numbers 0...n-1 and scramble it
  }
 
  public String getName()        { return name; }    // algorithm name
  public int    getSize()        { return array.length; }  // internal array length
  public long   getNumSwaps(){ return counterswap; }          // maintain counters for various operations 
  public long   getNumCompares() { return countercompare; }
  public long   getNumGets()     { return counterget; }
  public long   getNumSets()     { return counterset; }
  public int  getNum(int i){ // fetch an internal array value out (and count it)
    counterget += 1;
    return array[i]; 
  } 
  public void setNum(int i,int x)    {  
    array[i] = x;
    counterset += 1;
  }     // set a value into the internal array (and count it)
  public void reset() {  
    counterget  = 0;
    counterset  = 0;
    counterswap = 0;
    countercompare = 0;
  }
  
  public void newIncreasing(int n) {
    reset();
    length = n;
    array = new int[n];
    for (int i = 0; i < n; i++) 
    {
      array[i] = i;
    }
 
  } // populate internal array 0...n-1
  
  public void newDecreasing(int n) {
    reset();
    array = new int[n];
    length = n;
    System.out.println("");
    for (int i = 0; i < n; i++) 
    {
      array[i] = -i+n-1;
    }
   
  } // populate internal array n-1...0
  
  public void newScramble(int n) {     // populate internal array with values 0...n-1, scrambled
    // the standard way to scramble n numbers is
    newDecreasing(n);
    Random ran = new Random();
    for (int i = 0; i < n; i++) 
    {
      int j; 
      j = ran.nextInt(n);
      indexSwap(i,j);
      //reset();
    }
    // i=0; j=a random index 0 <= j < n: swap the values at indices i and j
    // i=1; j=a random index 0 <= j < n: swap the values at indices i and j
    // ...
    // You will need to google to find out how to get java to give you random numbers 0 <= j < n
  }
  
  public boolean isSorted() {
    for(int i = 0; i<getSize()-1; i++){
      if(array[i] > array[i+1]){
        return false;
      }
    }
    return true;} // test whether internal array is sorted (in increasing order)
  
  public void print(boolean print_nums) {
    System.out.println("Alg," + name + ",N," + length + ",Comps," + countercompare + ",swaps," + counterswap + ",gets," + getNumGets() + ",sets," + counterset + ",total," + (countercompare+counterswap+counterget+counterset) + ",sorted," + isSorted());
    if(print_nums == true){
      for (int i = 0; i < length; i++) 
      {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    //System.out.println(counterget + " " + counterset);
    //System.out.println(counterswap);

  } // print all the counters, and optionally the internal array
 
  // this is for comparing internal array values at indices i and j -- must be counted in getNumCompares()
  public boolean indexLessThan(int i, int j){ 
    countercompare +=1;
    if(array[i]>array[j]){
      return false;
    }
    else{
      return true;
    }
  }
  
  // this is for comparing actual values x and y -- must be counted in numCompares()
  public boolean valueLessThan(int x, int y) {
    int i = getNum(x);
    int j = getNum(y);
    if(i>j){
      return false;
    }
    else{
      return true;
    }
  }
  
  // this is for swapping internal array values at indices i and j -- must be counted in getNumSwaps()
  public void indexSwap(int i, int j) {
    
    int swaphold;
    swaphold = array[i];
    array[i] = array[j];
    array[j] = swaphold;
    counterswap +=1;
  }
  
  // note there is no valueSwap(int x, int y), because java only passes by value, not by reference, 
  // so a function valueSwap() cannot cause the values of x and y to swap in the perspective of the caller
  
  // This function is to be overridden by various sorters
  // Because the internal array is private, values cannot be gotten out without hitting the 'get' counter
  // sort should use indexLessThan(), to ensure comparisons get properly counted
  // If an algorithm cannot be done in place, then calls to getNum() and setNum() will be counted
  // The caller must use valueLessThan() and not cheat on the comparison count by using uncounted <
  public abstract void sort();
}
