public class CodeTestOne {
  
  /*
  Write a function that takes an integer minutes and converts it to seconds.
	  Examples
	  convert(5) ➞ 300
	  convert(3) ➞ 180
	  convert(2) ➞ 120
   */
  
  public int convert(int min){
    
    return  min * 60;
  }
  
  /*
  Create a function that takes an array and returns the first element.
    Examples
    getFirstValue([1, 2, 3]) ➞ 1
    getFirstValue([80, 5, 100]) ➞ 80
    getFirstValue([-500, 0, 50]) ➞ -500
   */
  
   public int getFirstValue(int arr[]){
       return arr[0];
   }
   
   /*
   Create a function that takes two integers and checks if they are equal.
      Examples
      isEqual(5, 6) ➞ false
      isEqual(1, 1) ➞ true
      isEqual(36, 35) ➞ false
    */
  
  public boolean isEqual(int a, int b){
    if (a == b){
      return  true;
    }else {
      return  false;
    }
    
  }
  
}
