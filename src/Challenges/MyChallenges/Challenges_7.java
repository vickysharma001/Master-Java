package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO SIMPLE INTEREST CALCULATOR !");

        System.out.println("Please enter your principle amount Rs");
        int principle = sc.nextInt();

        System.out.println("NOW, Tell me your rate Interest ");
        float rate = sc.nextFloat();

        System.out.println("Now , tell me for how many years are you Borrowing you to ");
        float years = sc.nextFloat();

        float interest = (principle * rate * years)/100;
        System.out.println("\n\n Your Simple Interest is Rs "+interest);
    }
}
