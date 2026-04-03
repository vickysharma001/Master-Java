
package Challenges.MyChallenges;

public class Challenges_29 {

    public static void main(String[] args) {

        System.out.println("#----------------WELCOME TO SUM AND AVERAGE OF THE ARRAY--------------#\n");
        int[] numArray = ArrayUtility.inputArray();

        long sumArray = sumArray(numArray);
        double averageArray = averageArray(numArray);

        System.out.println("SUM OF THE NUMBER IS: " + sumArray);
        System.out.println("AVERAGE OF THE NUMBER IS: " + averageArray);
    }

    public static long sumArray(int[] numArray){

        long sum = 0 ; // addition
        int index = 0; // array[index] of this array....

        while(index < numArray.length){
            sum += numArray[index];
            index++;
        }

        return sum;
    }

    public static double averageArray(int[] numArray){

        long sum = sumArray(numArray);

        return (double) sum / numArray.length;
    }
}
