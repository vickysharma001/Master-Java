package Challenges;

import java.util.*;
public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name..");

        String yourNumber = sc.nextLine();

        System.out.println("Good Morning "+yourNumber);

        System.out.println(yourNumber+", Also tell your age");

        String age = sc.nextLine();

        System.out.println("Yore age is :"+ age);

    }
}
