package Java_Basics;

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator ");

        System.out.println("Please enter your age :");
        int age = sc.nextInt();

        System.out.println("Are you a female? (True/False)");
        boolean isFemale = sc.nextBoolean();

         if (age < 5){
             System.out.println("You got 75% discount ");
         } else if (isFemale) {
             System.out.println("You got 50% discount ");
         } else if (age > 60 && !isFemale) {
             System.out.println("You got 25% discount");
         }
    }
}
