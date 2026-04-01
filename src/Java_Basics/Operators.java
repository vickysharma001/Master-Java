package Java_Basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO SWAPPING STATION :");

        System.out.println("PLEASE ENTER YOUR FIRST VALUE OF A :");
          int A = sc.nextInt();

        System.out.println("PLEASE ENTER YOUR SECOND VALUE OF B :");
          int B = sc.nextInt();

          int C = A ; // A IS VALUE IS 22
          A = B ;  // B IS VALUE IS 34
          B = C ;
        System.out.println("YOUR SWAPPING IS DONE ! ");
        System.out.println("YOUR VALUE OF A IS :"+A);
        System.out.println("YOUR VALUE OF B IS :"+B);

    }
}
