package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Check Number is Palindrome or not ");
        System.out.println("Enter your number");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);

        if(isPalindrome){
            System.out.println("This is The Palindrome Number");
        } else{
            System.out.println("This is Not a Palindrome Number");
        }
    }


    public static  boolean isPalindrome(int num){
          int reverse = reverse(num);
          return   num == reverse;
    }

    public static int  reverse(int num){
        int newNum = 0;
        while (num > 0){
           int digit = num % 10 ;
           newNum = newNum * 10 + digit ;
           num /= 10;
        }
        return newNum;
    }
}
