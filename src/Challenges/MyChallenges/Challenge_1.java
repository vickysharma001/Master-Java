package Challenges.MyChallenges;

// Question ->  create a program to input User name and print Welcome in KG Coding ..


import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR NAME .. ");

        String yourGoodName = sc.nextLine();
        System.out.println( "WELCOME "+ yourGoodName+ " in KG Coding");
    }

    public static class UserPattern {
        public static void main(String[] args) {
            System.out.println("* ");
            System.out.println("* * ");
            System.out.println("* * * ");
            System.out.println("* * * *");
            System.out.println("* * * * *  ");
        }
    }
}
