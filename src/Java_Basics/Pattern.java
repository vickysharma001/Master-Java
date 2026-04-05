package Java_Basics;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Welcome to print Pattern");

        rightHandedPattern();
    }

    public static void rightHandedPattern() {

        int index = 0;
        while (index < 10) {
            int j = 0;
            while (j < index) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            index++;
        }
    }


}

