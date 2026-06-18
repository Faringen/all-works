package Labaratory_20;

public class OneObject {
  static void main(){
      Formula formula2;
      Formula formula = Formula.getInstance();
      System.out.println( formula.calculate(2, 0));
      Formula formula1 = Formula.getInstance();
      System.out. println(formula1.calculate(12, 84));
  }
}
class Formula{
    private static Formula instance;

    private Formula() {}
    public static Formula getInstance(){
        instance = new Formula();
        return instance;
    }
    public double calculate(double x, double y) {
        if (y == 0) {
            System.out.println("Деление на ноль недопустимо");
            return 0;
        }
        return (2 * x) + (3.0 / y);
    }
}