package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To SumOfDigit");
        System.out.println("Please enter your digit");


        int num = sc.nextInt();
        int sum = sumOfDigit(num);

        System.out.println("The SumOfDigit "+sum);
    }

    public static int sumOfDigit(int num){

        int sum = 0 ;

        while(num > 0){
            sum += num % 10 ;
            num /= 10 ;
        }

         return sum ;
    }
}
