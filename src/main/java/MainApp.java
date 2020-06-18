public class MainApp {

  
  static  BasicIncome basicIncome = new BasicIncome();
  public static void main(String[] args) {
	basicIncome.setBasicsSalary(5000);
    System.out.println(basicIncome.getBasicsSalary());
    System.out.println(basicIncome.getSSNIncome());
    System.out.println(basicIncome.getBonus());
    System.out.println(basicIncome.getGrossIncome());
  }
}
