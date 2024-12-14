package operator.ex;

// import java.util.Random;


public class OperatorEx3 {
    public static void main(String[] args){
        // Random random = new Random();
        // int score = random.nextInt(101);

        int score = (int)(Math.random() * 101);

        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}