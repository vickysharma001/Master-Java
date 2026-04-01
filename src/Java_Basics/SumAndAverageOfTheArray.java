package Java_Basics;

import java.util.Scanner;
import java.util.Scanner;

public class SumAndAverageOfTheArray {

    // 1. Array input lene ka method
    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("----WELCOME TO SUM AND AVERAGE----");
        System.out.println("Please enter the no of elements:");

        int size = input.nextInt();
        int[] myArr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) +  ": ");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }

    // 2. Sum calculate karna
    public static long sum(int[] myArr) {
        long sum = 0;
        int index = 0;             // index int hona chahiye, long nahi

        while (index < myArr.length) {
            sum += myArr[index];
            index++;
        }
        return sum;
    }

    // 3. Average calculate karna
    public static double average(int[] myArr) {
        long sum = sum(myArr);
        return (double) sum / myArr.length;  // double use karo int nahi
    }

    // 4. Main method — sirf ek hoga
    public static void main(String[] args) {
        int[] myArr = takeInput();           // pehle array lo

        long sum = sum(myArr);
        double average = average(myArr);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
