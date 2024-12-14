package operator;

public class Operator4 {
    public static void main(String[] args){
        String str1 = "strings1";
        String str2 = "strings2";

        boolean result1 = "hello".equals("hello"); // Comparing two literals
        boolean result2 = str1.equals(str2); // Comparing two string variables

        System.out.println(result1); // true

        System.out.println(result2); // false
    }
}