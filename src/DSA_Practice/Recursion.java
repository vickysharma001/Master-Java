package DSA_Practice;


public class Recursion{

     public static int fibMemoization(int n , int f[]){
         if(n == 0 || n == 1 ){
             return n ;
         }
         if( f[n] != 0){ // f[n] is already calculated .
             return  f[n];
         }
          f[n] = fibMemoization(n-1,f) + fibMemoization(n-2,f);
           return f[n];
     }

    public static void main(String[] args) {
        int n = 7 ;
        int f[] = new int[n+1];
        System.out.println("The Fibonacci Number is "+fibMemoization(n,f));
    }
}































//
//// Tabulation means create a table ..
//public class Recursion {
//
//      public static  int Tabulation(int n ){
//         int dp[] = new int[n+1]; // table
//         dp[0] = 0;
//         dp[1] = 1 ;
//
//         for(int i = 2 ; i <= n ; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//      }
//
//    public static void main(String[] args) {
//          int n = 7;
//
//        System.out.println(Tabulation(n));
//    }
//}


//
//import java.util.Scanner;
//
//public class Recursion {
//
//      public static int fib(int n ){
//          if( n == 0 || n == 1 ){
//              return n ;
//          }
//          return fib(n-1) + fib(n-2) ;
//      }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter your Fibonacci Number ");
//        int n = sc.nextInt();
//        System.out.println("The Recursion is -> "+fib(n));
//
//    }
//}



