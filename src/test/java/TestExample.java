import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestExample {
  
  @Test
  public void testInfo(){
    
    Example example = new Example();
    example.getInfo("Test");
    System.out.println("This test is passed");
  }
  
  @Test
  public void testArraySize(){
    Example example = new Example();
    int arr[] = {11,22,33,44,55, 78,88,99,78,90};
    int arrOne[] = {1,2,3,4,5};
//    example.sizeOfArray(arr);
    
    // call the array function and if return type true then test is passed
    Assert.assertTrue(example.sizeOfArray(arr));
    
    // more then 9 element in an array.. false
    Assert.assertFalse(example.sizeOfArray(arrOne));
    
  }
  
  
  
  
}
