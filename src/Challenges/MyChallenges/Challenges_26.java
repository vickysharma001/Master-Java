package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number");
        int rows = input.nextInt();
       pattern(rows);

    }

    public static void pattern(int maxRows){

        int rows = 0 ;
        while(rows < maxRows){
            System.out.print("*");

            int i = 0 ;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}

