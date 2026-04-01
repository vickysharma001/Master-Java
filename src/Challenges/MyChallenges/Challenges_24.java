package Challenges.MyChallenges;

//import java.util.Scanner;
//
//public class Challenges_24 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome To Here Check The Prime Number");
//        System.out.println("Please Enter Your Number");
//        int  num = input.nextInt();
//
//        boolean isPrimeNumber = isPrimeNumber(num);
//         if(isPrimeNumber){
//             System.out.println("This The Prime NUmber");
//         } else{
//             System.out.println("This is Not The Prime Number");
//         }
//    }
//     public static boolean isPrimeNumber(int num){
//
//        int i = 2;
//        while (i < num){
//           if(num % i == 0){
//               return true;
//           }
//            i++;
//        }
//        return false;
//     }
//}


import java.util.Scanner;

public class Challenges_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Check The Number is ArmStrong or Not");
        System.out.println("Please Enter your Number");
        int num = input.nextInt();

        boolean numberIsArmStrongOrNot = numberIsArmStrongOrNot(num);

        if (numberIsArmStrongOrNot) {
            System.out.println("This is The ArmStrong Number");
        } else {
            System.out.println("This is Not The ArmStrong Number");
        }
    }

    public static boolean numberIsArmStrongOrNot(int num) {

        int noOfDigits = noOfDigits(num);
        int numCopy = num ;

        int finalNumber = 0 ;

        while (num > 0){
            int lastDigit = num % 10;
            num /= 10 ;

         finalNumber  += Pow(lastDigit, noOfDigits);
        }

        return finalNumber == numCopy;
    }

   public static int Pow(int num1, int num2) {
       int result = 1;
       int i = 0;

       while (i < num2) {
           result *= num1;
           i++;
       }
        return result;
   }

   public static int noOfDigits(int num) {
        int digits = 0 ;

       while (num > 0){
            digits++;
            num /= 10;

       }
       return digits;

   }
}
























