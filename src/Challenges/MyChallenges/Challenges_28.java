package Challenges.MyChallenges;



// 2D Array....
// matrix logic.
public class Challenges_28 {

    public static void main(String[] args) {

        int[][] myArr = {{1,2},{4,5,6,7},{7,8,9,9}};
     //   System.out.println(myArr[1].length);

        int index = 0;
         while(index < myArr.length){

             int j = 0 ;
             while (j < myArr[index].length){
                 System.out.print(myArr[index][j]+ " ");
                 j++;
             }
             System.out.println();
             index++;
         }
    }
}

