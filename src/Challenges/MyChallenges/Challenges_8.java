package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO TEMPERATURE Converter");

        System.out.println("ENTER YOUR TEMP IN F :");
        float fah = sc.nextFloat();
        float cel = (fah - 32) * 5 / 9 ;

        System.out.println("YOUR TEMPERATURE IS -> "+ cel);

    }
}
