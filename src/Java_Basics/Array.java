package Java_Basics;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int[] myArr ={10,20,30,40,50};
        System.out.println("Welcome to Searching ");
        System.out.println("Please Enter your Element You want to search");

        int num = input.nextInt();

        boolean isFound = isFound(myArr,num);

        if(isFound){
            System.out.println("Your Element Found in This Array");
        } else {
            System.out.println("Your Element was not found the Array");
        }
    }

    public static boolean isFound(int[] myArr, int num ){

        int index = 0 ;
        while (index < 4){
            if(myArr[index] == num){
                return true;
            }
            index++;
        }

        return false;
    }
}
