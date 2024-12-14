package operator;

public class Operator2 {
    public static void main(String[] args) {
	      int sum1 = 1 + 2 * 3;
	      int sum2 = (1 + 2) * 3;
	      System.out.println("sum1 = " + sum1); // sum1 = 7
	      System.out.println("sum2 = " + sum2); // sum2 = 9

	      int sum3 = 2 * 2 + 3 * 3;
	      int sum4 = 2 * ( 2 + 3 ) * 3;
	      System.out.println("sum3 = " + sum3); // sum3 = 13
	      System.out.println("sum4 = " + sum4); // sum4 = 9
    }
}