package operator;

public class OperatorAdd1 {
    public static void main(String[] args){
        int num = 0;
        num++;
        System.out.println(num); // 1

        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);
    }
}