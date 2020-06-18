public class BasicIncome {

  private double basicsSalary;

  public double getBasicsSalary() {
    return basicsSalary;
  }

  public void setBasicsSalary(double basicsSalary) {
    if (basicsSalary < 0) {
      throw new IllegalArgumentException("Income should not be in negative amount..");
    }
    this.basicsSalary = basicsSalary;
  }

  // TODO
  // 1. gross income  = net income + SSN  + bonus;
  // 2. get SSN about
  // 3. get Bonus amount
  // 4. get net income..

  public double getSSNIncome() {
    return this.basicsSalary * 25 / 100;
  }

  public double getBonus() {
    return this.basicsSalary * 10 / 100;
  }

  public double getGrossIncome() {
    return this.basicsSalary + getSSNIncome() + getBonus();
  }
}
