//This file contains all LeetCode problems that I have solved.
class LeetCode{
    public static void main(String[] args){
        //main function
    }
}

//1: Search in 2D Matrix 
//difficulty  : Medium

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j < colLength;j++){
                if(matrix[i][j]== target) return true;
                else continue;
            }
        }
        return false;
    }
}