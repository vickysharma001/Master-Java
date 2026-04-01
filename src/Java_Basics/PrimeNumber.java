package Java_Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Check The Prime Numbers");
        System.out.println("Enter your Number");

        int num = input.nextInt();
        boolean isPrimeNumber = isPrimeNumber(num);

        if (isPrimeNumber){
            System.out.println("This The Prime Number");
        } else {
            System.out.println("This is Not a prime Number");
        }
    }
    public static boolean isPrimeNumber(int num){

        int i = 2 ;
        while (i < num){
            if( num % i == 0){
                return false;
            }
            i++;
        }
        return true ;
    }
}
