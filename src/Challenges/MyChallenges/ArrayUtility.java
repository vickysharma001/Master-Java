package Challenges.MyChallenges;

// Input ARRAY Process
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray(){
        System.out.println("PLEASE ENTER THE NUMBER OF ELEMENTS");
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = input.nextInt();
        int[] myArray = new int[size];

        int index = 0 ;
        while (index < size){
            System.out.print("Enter the no element of the array "+ (index + 1) + ":");
            myArray[index] = input.nextInt();
            index++;

        }
         return myArray;
    }

}
