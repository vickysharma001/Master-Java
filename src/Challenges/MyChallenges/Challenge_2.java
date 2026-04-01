package Challenges.MyChallenges;

// w.a.p add two number with user


import java.util.*;
public class Challenge_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME IN OUR CALCULATOR");
        System.out.println("ENTER YOUR FIRST NUMBER ");
        int yourFirstNumber = sc.nextInt();

        System.out.println("ENTER YOUR SECOND NUMBER");
        int yourSecondNumber = sc.nextInt();

        int sumTwoNumber = yourFirstNumber + yourSecondNumber;

        System.out.println( " Your Number is "+sumTwoNumber);
    }
}
