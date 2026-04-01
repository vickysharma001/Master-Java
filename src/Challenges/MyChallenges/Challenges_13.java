package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd Sum");
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        int sum = sumOfAllOddNumbers(num);
        System.out.println("OddSum till " + num + " is: "+ sum);
    }

    public static int sumOfAllOddNumbers(int num){

        int sum = 0 ;
        int i = 1 ;
        while(i <= num){
            sum  += i ; // sum + i
            i += 2 ;  // i + 2 ;
        }

       return sum ;
    }
}
