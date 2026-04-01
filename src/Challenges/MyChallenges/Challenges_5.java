package Challenges.MyChallenges;


// -> w.a.p to calculate perimeter of a rectangle;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenges_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATE PERIMETER OF A RECTANGLE");
        System.out.println("-------------------------------------");

        System.out.println("ENTER YOUR FIRST SIDE OF RECTANGLE A ! ");
        float perimeterFirstSide = sc.nextFloat();

        System.out.println("ENTER YOUR SECOND SIDE OF RECTANGLE B !");
        float perimeterSecondSide = sc.nextFloat();

        System.out.println("ENTER YOUR THIRD SIDE OF RECTANGLE C");
        float perimeterThirdSide = sc.nextFloat();

        System.out.println("ENTER YOUR FOURTH SIDE OF RECTANGLE D");
        float perimeterFourthSide = sc.nextFloat();

        float totalNumberAllSideOfPerimeter = perimeterFirstSide + perimeterSecondSide + perimeterThirdSide + perimeterFourthSide ;

        System.out.println("TOTAL NUMBER  ALL SIDE OF PERIMETER IS  -> "+totalNumberAllSideOfPerimeter);
    }
}
