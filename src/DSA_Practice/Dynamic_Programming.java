package DSA_Practice;

// problem Stairs Count
//  simple recursion way ..
//public class Dynamic_Programming {
//
// public static int countWays(int n){
//      if(n == 0){
//          return 1 ;
//      }
//      if(n < 0){
//          return 0;
//      }
//      return  countWays(n-1) + countWays(n-2);
// }
//  public static void main(String[] args) {
//           int n = 5;  // n = 3 -> 3 ways & n = 4 -> 5 ways.
//      System.out.println(countWays(n));
//    }
//}


import java.util.Arrays;

// Memoization
public class Dynamic_Programming {

     public static int CountWays(int n, int ways[]){
         if(n == 0){
             return 1;
         }
         if(n < 0){
             return 0;
         }
         if(ways[n] != -1){
             return ways[n];
         }
          ways[n] = CountWays(n-1,ways) + CountWays(n-2,ways);
          return ways[n];
     }

    public static void main(String[] args) {
       int n = 2 ;
       int ways[] = new int [n+1];
       Arrays.fill(ways,-1);
        System.out.println("The Numbers of Stairs .. \n"+CountWays(n,ways));
    }
}