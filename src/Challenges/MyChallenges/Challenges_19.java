package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_19 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To LCM ");

        System.out.println("Please enter your  first number :");
        int first = sc.nextInt();

        System.out.println("Please Enter your Second Number ");
        int second = sc.nextInt();

        int lcm = lcm(first , second);
        System.out.println("LCM of the Two Numbers is :"+lcm);

    }

    public static int lcm(int first , int second){
        int i = 1 ;
        while(i <= second){
            int factor = first * i;

            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
