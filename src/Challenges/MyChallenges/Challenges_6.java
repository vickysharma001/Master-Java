package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWELCOME TO CALCULATE THE AREA OF TRIANGLE !");
        System.out.println("---------------------------------------------");

        System.out.println("ENTER THE BREATH OF TRIANGLE !");
         float breathOfTriangle = sc.nextFloat();

        System.out.println("ENTER THE HEIGHT OF TRIANGLE !");
         float heightOfTriangle = sc.nextFloat();

         float areaOfTriangle = (1f/2)*breathOfTriangle*heightOfTriangle;

        System.out.println("YOUR AREA OF TRIANGLE IS ->"+areaOfTriangle);

    }
}
