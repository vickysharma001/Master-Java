package Java_Basics;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        // > greater , < less than >= greater than equal , <= less than equal
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to driving License Portal");
        System.out.println("Please Enter your age ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible to Driving License ");
        }
            else{
                System.out.println("Beta Cycle chalao");
            }
    }
}

