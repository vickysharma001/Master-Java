package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        long fact = FactorialNumber(num);
        System.out.println("Factorial is :"+fact);
    }

    public static long FactorialNumber(int num){

        if(num < 2 ){
            return 1 ;
        }

        long fact = 1 ;
        int i = 2 ;

        while (i <= num ){
            fact *= i;
            i++;
        }
        return fact ;
    }
}

