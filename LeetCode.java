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
//Intersection of two integer Array:

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays to ensure duplicate elements are adjacent
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // Check if the current element is not a duplicate
                if (index == 0 || result[index - 1] != nums1[i]) {
                    result[index++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        // Trim the result array to remove unused elements
        return Arrays.copyOf(result, index);
    }
}
