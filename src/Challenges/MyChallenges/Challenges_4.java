package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWELCOME TO PRINT YOUR PRODUCT OF TWO FLOATING NUMBER\n ");
        System.out.println("--------------------------------------------");

        System.out.println("ENTER YOUR FIRST FLOATING NUMBER ");
        float yourFirstFloatingNumber = sc.nextFloat();

        System.out.println("ENTER YOUR SECOND FLOATING NUMBER ");
        float yourSecondFloatingNumber = sc.nextFloat();

        System.out.println("\n Result is :" + (yourFirstFloatingNumber + yourSecondFloatingNumber));
       //  float productTwoFloatingNumber = yourFirstFloatingNumber * yourSecondFloatingNumber;

      //  System.out.println("THE PRODUCT OF TWO FLOATING NUMBER ->\n"+productTwoFloatingNumber);
    }
}
