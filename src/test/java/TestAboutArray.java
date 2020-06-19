import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TestAboutArray {

  private AboutAnArray aboutAnArray;

  @BeforeEach
  void init() {
    aboutAnArray = new AboutAnArray();
  }

  @Test
  public void testSum28() {
    int[] arrOne = {2, 3, 2, 2, 4, 2};
    int[] arrTwo = {2, 3, 2, 2, 4, 2, 2};
    int[] arrThree = {1, 2, 3, 4};
    assertTrue(aboutAnArray.sum28(arrOne));
    assertFalse(aboutAnArray.sum28(arrTwo));
    assertFalse(aboutAnArray.sum28(arrThree));
  }

  @Test
  public void testHaveThree() {
    int[] arrOne = {3, 1, 3, 1, 3};
    int[] arrTwo = {3, 1, 3, 3};
    int[] arrThree = {1, 2, 3, 4};
    assertTrue(aboutAnArray.haveThree(arrOne));
    assertTrue(aboutAnArray.haveThree(arrTwo));
    assertFalse(aboutAnArray.haveThree(arrThree));
  }

  @Test
  public void testEvenAndOdd() {
    int[] arrOne = {1, 0, 1, 0, 0, 1, 1};
    int[] arrTwo = {3, 3, 2};
    int[] arrThree = {2, 2, 2};
    int[] arrOneResult = {0, 0, 0, 1, 1, 1, 1};
    int[] arrTwoResult = {2, 3, 3};
    int[] arrThreeResult = {2, 2, 2};

    assertArrayEquals(arrOneResult, aboutAnArray.evenOdd(arrOne));
    assertArrayEquals(arrTwoResult, aboutAnArray.evenOdd(arrTwo));
    assertArrayEquals(arrThreeResult, aboutAnArray.evenOdd(arrThree));
  }
  
  @Test
  public void testMore14(){
    int[] arrOne = {1, 4, 1};
    int[] arrTwo = {1, 4, 1, 4};
    int[] arrThree = {1, 1};
    assertTrue(aboutAnArray.more14(arrOne));
    assertFalse(aboutAnArray.more14(arrTwo));
    assertTrue(aboutAnArray.more14(arrThree));
  }
  
  

  @AfterEach
  public void cleanUp() {
    aboutAnArray = null;
    System.out.println("Cleaned Up the code");
  }
}
