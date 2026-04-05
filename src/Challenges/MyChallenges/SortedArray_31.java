package Challenges.MyChallenges;

public class SortedArray_31 {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Sorting Check post\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean isIncreasing = isIncreasing(numArr);
        boolean isDecreasing = isDecreasing(numArr);

        if(isIncreasing || isDecreasing){
            System.out.println("YOUR ARRAY IS SORTED");
        } else{
            System.out.println("YOUR ARRAY IS NOT SORTED");
        }
    }

    public static boolean isIncreasing(int[] numArr) {
        int index = 1;
        while (index < numArr.length) {
            if (numArr[index] < numArr[index - 1]) {
                return false;
            }
            index++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr) {
        int index = 1;
        while (index < numArr.length) {
            if (numArr[index] > numArr[index - 1]) {
                return false;
            }
            index++;
        }
        return true;
    }
}
