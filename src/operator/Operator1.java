package operator;

public class Operator1 {
    public static void main (String[] args){
        String result = "hello " + "world";
        System.out.println(result);

        String s1 = "Java", s2 = "Hello ";
        result = s2 + s1;
        System.out.println(result);

        int num = 2025;
        String str1 = "Happy new year ";
        result = str1 + num;
        System.out.println(result);
    }
}