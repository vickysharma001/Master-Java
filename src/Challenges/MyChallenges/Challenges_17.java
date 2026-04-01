package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Find The Area Of Circle ");
        System.out.println("Please Enter The Radius Of Circle");

        double r = sc.nextDouble();
        double radius = circleOfArea(r);

        System.out.printf("The Area Of Circle is: %.2f", radius);
    }

    public static double circleOfArea(double r){

        double radius = 3.14 * r * r ;
        return radius ;
    }
}
