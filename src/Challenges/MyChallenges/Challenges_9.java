package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_9 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Number checker\n");
        System.out.println("Please enter your number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Your number is Positive "+num);
        } else if (num == 0){
            System.out.println("Your number is Zero "+num);
        }
        else{
            System.out.println("Your number is Negative "+num);
        }
    }
}
