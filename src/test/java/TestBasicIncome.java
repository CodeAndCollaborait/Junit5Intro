import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestBasicIncome {

  private BasicIncome basicIncome;

  @BeforeEach
  void init() {
    basicIncome = new BasicIncome();
  }

  // Test to Setup Income
  @Test
  public void testIncome() {

    // Set the Income for User as 7000 ..and Verify
    double income = 7000;
    basicIncome.setBasicsSalary(income);
    assertEquals(income, basicIncome.getBasicsSalary());
    System.out.println("Basic Income " + basicIncome.getBasicsSalary());

    // Test the SSN income..
    double SSN = income * 0.25;
    assertEquals(SSN, basicIncome.getSSNIncome());
    System.out.println("SSN Income " + basicIncome.getSSNIncome());

    // Test for Bonus
    double bonus = income * 0.10;
    assertEquals(bonus, basicIncome.getBonus());
    System.out.println("Bonus Income: " + basicIncome.getBonus());

    // Test for Gross Income...
    double grossIncome = income + SSN + bonus;
    System.out.println("Gross Income " + grossIncome);
    assertEquals(grossIncome, basicIncome.getGrossIncome());
  }

  @DisplayName("Test for Invalid Income")
  @Test
//  @Disabled
  public void testInvalidIncome() {

    double income = -1000;
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          basicIncome.setBasicsSalary(income);
        });

    final int incomeOne = 1000;
    assertDoesNotThrow(
        () -> {
          basicIncome.setBasicsSalary(incomeOne);
        });
  }
}
