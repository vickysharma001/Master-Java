package Challenges.MyChallenges;

import java.util.Scanner;

import java.util.Scanner;

public class Challenges_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Fibonacci Series");
        System.out.println("Please Enter The Number up to Which series");
        int num = input.nextInt();
        System.out.print("Here is the Fibonacci Series: ");
        fibonacciNumber(num);
    }

    public static void fibonacciNumber(int num) {
        if (num < 0) return;
        System.out.print("0 ");

        if (num < 1) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");  // print, not println
            first = second;
            second = third;
        }
    }
}


