import org.junit.jupiter.api.*;

public class AnnotationDemo {
  
  
  @BeforeAll
  static void initAll(){
    // I want to connect to DB.. or load file..
    System.out.println("Before All");
  }
  
  //Prepare or create an object before specific test
  @BeforeEach
  void init(){
    System.out.println("Before Each");
  }
  
  @Test
  public void  someTest(){
    System.out.println("Test One");
  }
  
  @Test
  public void someTestTwo(){
    System.out.println("Test Two");
  }
  
  @AfterEach
  public void afterEachTest(){
    System.out.println("After Each Test");
  }

  @AfterAll
  public static void cleanUp(){
    System.out.println("This is After All");
  }


}
