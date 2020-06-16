
public class Example {
  
  public String getInfo(String info){
    
    return "This is information" + info;
    
  }
  
  /**
   * Method called ArraySize.. if array size is less then 9 then return false else return true..
   * Array must be pass into args..
   */
  
  public boolean sizeOfArray(int[] arr){
    if (arr.length < 9){
      return  false;
    }else {
      return  true;
    }
    
  }

  
}
