package Java_Basics;

//public class Loops {
//    public static void main(String[] args) {
//
//        int row = 1;
//
//        while (row <= 5) {
//
//            int column = 1;
//
//            while (column <= row) {
//                System.out.print("*");
//                column++;
//            }
//
//            System.out.println(); // move to next line
//            row++;
//        }
//    }
//}
//public class Loops {
//    public static void main(String[] args) {
//        // reverse a number
//        int n = 987654321 ;
//        while(n > 0) {
//            int lastDigit = n % 10;
//
//            n = n / 10;
//
//            System.out.println("The reverse number is " + n);
//        }
//    }
//}





import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("The Number is prime"+" ");
         } else{
            System.out.println("The Number is not prime"+" ");
        }
    }
}


















