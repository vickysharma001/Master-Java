package Java_Basics;

//public class Method {
//    public static void main(String[] args) {
//        greeting();
//        welcoming();
//        howToWork();
//    }
//
//    public static void greeting(){
//        System.out.println("Welcome to our Company ! ");
//    }
//
//    public static void welcoming(){
//        System.out.println("Welcome Vicky Sharma");
//    }
//    public static void howToWork(){
//        System.out.println("Working with Full Concentration");
//    }
//}

//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class Method {
//    public static void main(String[] args) {
//
//        int number = getInput();   // method call
//
//        System.out.println("Number is: " + number);
//
//    }
//
//    public static int getInput() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//
//        int number = sc.nextInt();
//
//        return number;   // returning value
//
//    }
//}

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        int sumOfTwoNumber = fastExecution();

        System.out.println("Sum Of Two Number is " + sumOfTwoNumber);
    }

    public static int fastExecution(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To Add Two Numbers");
        System.out.println("Please Enter First Number");
        int firstNumber = sc.nextInt();

        System.out.println("Please Enter Second Number");
        int secondNumber = sc.nextInt();

        int sumOfTwoNumber = firstNumber + secondNumber;

        return sumOfTwoNumber;
    }
}
