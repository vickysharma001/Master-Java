package Java_Basics;
//// not return function
//public class Function {
//    public static void main(String[] args) {
//           greet();
//    }
//
//    public static void greet(){
//        System.out.println("Good Morning Vicky");
//
//    }
//}

public class Function {
    public static void main(String[] args) {

        int num = sumTwoNumbers(4,7);
        System.out.println(num);
    }
    public static int sumTwoNumbers(int First , int Second){
        int sum = First + Second ;
        return sum ;
    }
}