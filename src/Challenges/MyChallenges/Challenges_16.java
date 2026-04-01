package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To  Check The Prime Number ");
        System.out.println("Please Enter your Number ");

        int number = sc.nextInt();
        int prime = primeNumberOrNot(number);

    }

    public static int primeNumberOrNot(int number){


        if(number % 2 == 0){
            System.out.println("This is the prime Number");
        }else{
            System.out.println("This is not a Prime Number");
        }
        return 0 ;
    }
}
