package Challenges.MyChallenges;

public class MaxAndMinArray_31 {
    public static void main(String[] args) {
        System.out.println("Welcome to MAX and Min");

        int[] numArr = ArrayUtility.inputArray();

        int MinimumElement = MinimumElement(numArr);
        int MaximumElement = MaximumElement(numArr);

        System.out.println("Max of the Array is: "+ MaximumElement);
        System.out.println("Min of the Array is: "+ MinimumElement);

    }

    public static int MinimumElement(int[]numArr){
        int min = Integer.MAX_VALUE;
        int i = 0 ;
        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
            return min;
    }

    public static int MaximumElement(int[]numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int i = 1;
        int max = numArr[0];
        while(i < numArr.length){
            if(max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
           return max;
    }
}
