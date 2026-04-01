package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To RevereNumber ");
        System.out.println("Enter your Digit");
        int num = input.nextInt();
        int digit = reverseNumber(num);
        System.out.println("The Reverse Number is"+ digit);
    }

    public static int reverseNumber(int num){

        int newNum = 0 ;
        while(num > 0){ // 345
            int digit = num % 10 ; // 345 % 10
            newNum = newNum * 10 + digit; // 0 * 10 + 5
            num /= 10; // num / 10 // 5/10
        }
        return newNum;
    }
}
