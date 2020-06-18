import org.junit.Assert;
import org.junit.Test;


public class TestCodeTestOne {
 
	CodeTestOne testOne = new CodeTestOne();
  
  
  @Test
  public void testConvert(){
	Assert.assertEquals(300,testOne.convert(5));
	Assert.assertEquals(180,testOne.convert(3));
	Assert.assertEquals(120,testOne.convert(2));
  }
  
  @Test
  public void testGetFirstValue(){
    
    Assert.assertEquals(3, testOne.getFirstValue(new int [] {3,23,89, 11}));
	Assert.assertEquals(80, testOne.getFirstValue(new int [] {80, 5, 100}));
	Assert.assertEquals(-500, testOne.getFirstValue(new int [] {-500, 0, 50}));
  
  }
  
  @Test
  public void testIsEqual(){
    Assert.assertTrue(testOne.isEqual(22,22));
    Assert.assertFalse(testOne.isEqual(33, 34));
    Assert.assertEquals(true, testOne.isEqual(55, 55) );
  }
}
