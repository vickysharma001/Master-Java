package Challenges.MyChallenges;

import java.util.Scanner;

public class Challenges_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50}; // ✅ added array

        System.out.println("Welcome to Searching Your element");
        System.out.println("Please Enter your element You want to Search");
        int num = input.nextInt();

        boolean idFound = idFound(arr, num);

        if(idFound){
            System.out.println("your element is found ");
        } else{
            System.out.println(" your element is not found");
        }
    }


    public static boolean idFound(int[] arr, int num){

        int index = 0;
        while (index < arr.length){
            if(arr[index] == num){
                return true; // ✅ return index
            }
            index++;
        }
        return false ; // ✅ return -1 if not found
    }
}

