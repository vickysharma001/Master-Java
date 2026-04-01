package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To GCD");

        System.out.println("Please Enter Your First Number");
         int first = sc.nextInt();

        System.out.println("Please Enter Your Second Number");
        int Second = sc.nextInt();

        int gcd = gcd(first , Second);

        System.out.println("GCD of the Number is :"+ gcd);
    }

    public static int gcd(int num1 , int num2){

        int gcd = 1;
        int i = 2 ;

     int least = least(num1, num2);
      while (i <= least){

          i++;
      }

        return gcd ;
    }

    public static int least(int num1, int num2){
        if(num2 > num1){
            return num1;
        }
        return num2;
    }
}
