package Challenges.MyChallenges;
// create a program that takes two numbers and shows result of all arithmetic operators,


import java.util.Scanner;

public class Challenges_3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY CALCULATOR ! ");

        System.out.println("PLEASE ENTER YOUR FIRST NUMBER ..");
        int first = sc.nextInt();

        System.out.println("PLEASE ENTER YOUR SECOND NUMBER ..");
        int Second = sc.nextInt();

        int addition = first + Second ;
        int substraction = first - Second ;
        int multiplication = first * Second ;
        int division = first / Second ;
        int modulus = first % Second ;

        System.out.println("ADDITION IS ..-> "+addition);
        System.out.println("SUBSTRACTION IS ..-> "+substraction);
        System.out.println("MULTIPLICATION IS ..-> "+multiplication);
        System.out.println("DIVISION IS ..-> "+division);
        System.out.println("MODULUS IS ..-> "+modulus);
    }
}
