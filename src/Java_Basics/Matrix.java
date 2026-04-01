package Java_Basics;

import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        int[][] myArr = {{1,2,3,4},{4,6,7,5}};

       int index = 0;
       while (index < myArr.length){
           int j = 0;
           while (j < myArr[index].length){
               System.out.print(myArr[index][j]+ " ");
               j++;
           }
           System.out.println();
           index++;
       }

    }

}

//public class Matrix {
//
//    // function banaya
//    public static void printMatrix(int[][] arr) {
//
//        int index = 0;
//        while (index < arr.length) {
//            int j = 0;
//
//            while (j < arr[index].length) {
//                System.out.print(arr[index][j] + " ");
//                j++;
//            }
//
//            System.out.println();
//            index++;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[][] myArr = {{1,2,3,4},{4,6,7,5}};
//
//        // function call
//        printMatrix(myArr);
//    }
//}