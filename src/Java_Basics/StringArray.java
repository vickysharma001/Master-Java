package Java_Basics;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] myArr = {"Vicky Sharma", "Rajeev Kumar", "Arjun", "RAM"};

        System.out.println("\n---------------Welcome to Array String-----------");
        System.out.println("\nPlease enter your String");
        String name = input.next();

        boolean searchString = searchingString(myArr,name);

        if(searchString){
            System.out.println("Your String is Found in this Array");
        } else{
            System.out.println("Your String does not Found in this Array");
        }

    }

    public static boolean searchingString(String[] myArr, String name){

        int index = 0;
        while (index < myArr.length){
            if(myArr[index] == name){
                return false;
            }
            index++;
        }
           return true ;
    }

}







