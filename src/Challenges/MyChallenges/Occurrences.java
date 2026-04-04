package Challenges.MyChallenges;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("WELCOME TO ARRAY OCCURRENCES\n");

        int[] numArr = ArrayUtility.inputArray();
        System.out.println("NOW ENTER THE NUMBER YOU FIND\n");

        int num = input.nextInt();

        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("your element was found "+ occurrences);

    }

    public static int noOfOccurrences(int[] numArr, int num){

        int occ = 0;
        int i =0 ;

        while(i < numArr.length){
            if(numArr[i]== num){
                occ++;
            }
            i++;
        }
         return occ;
    }
}
