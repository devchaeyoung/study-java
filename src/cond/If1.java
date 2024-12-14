package cond;

public class If1{
    public static void main(String[] args){
        int thisYear = 2025;
        int userYears = 1996;

        int age = thisYear - userYears;

        System.out.println(age >= 18 ? "성인입니다" :"미성년자입니다");
//        if (age >= 18) {
//            System.out.println("성인입니다");
//        } else {
//            System.out.println("미성년자입니다");
//        }
    }
}