package Challenges;

public class Morning {
 
public static void main(String[]args){

System.out.println("Good Morning Vicky");

    }

    public static class Variable {
        public static void main(String[] args) {
            int myNumber  ; // Declare
            int yourNumber = 7;

            System.out.println(yourNumber);

            Float myFloatingNumber = 5.0f ;
            System.out.println(myFloatingNumber);

            boolean isVegetarian = false;
            System.out.println(isVegetarian);

            Double myDoubleValue = 8178.623316;
            System.out.println(myDoubleValue);
            boolean isVegetarianFoodOrNot = false ;

            if(!isVegetarianFoodOrNot){
                System.out.println("Give Veg Food");
            } else {
                System.out.println("Give Non-Veg Food");
            }

            boolean isRaining = true ;

            if(!isRaining){
                System.out.println("Go outside");
            }
            else{
                System.out.println("Stay home");
            }

           String myWishes = "GOOD MORNING";
            System.out.println(myWishes);

        }
    }
}