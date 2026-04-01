package Java_Basics;

public class IfElse {
    public static void main(String[] args) {

        boolean isMale = true ;

        String name = "Bob";

        System.out.println("BEFORE IF");
        if(isMale){
            System.out.println("Mr."+ name);
        } else {
            System.out.println("Mrs."+ name);
        }
        System.out.println("AFTER IF");


        boolean isSeniorCitizen = true ;
        boolean isAnAdult = false ;

        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult){
                System.out.println("Hello adult  ");
            } else {
                System.out.println("Hello child ");
            }
        }

    }

