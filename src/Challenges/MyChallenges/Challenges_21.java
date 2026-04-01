package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Prime World ");
        System.out.println("Please Enter your number");

        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if(isPrime){
            System.out.println("Your number is Prime Number");
        } else {
            System.out.println("Your number is Not a Prime Number");
        }
    }
    public static boolean isPrime(int num ){

        int i = 2 ;
        while (i < num){ // 2 < 5
            if(num % i == 0 ){
                return false;
            }
            i++;
        }
        return true;
    }
}
