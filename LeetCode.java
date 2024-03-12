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

// Checking Palindrome Number or not:
class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0){
            int rev=0;
            int temp=x;
            int rem =0;
            while(x>0){
                rem = x%10;
                rev = rev*10 + rem;
                x=x/10;
            }
            if(temp==rev) return true;
            else if (temp==0) return true;
            else return false;
        }else return false;                // as X=-121 after reversing X = 121- So it is not palindrome number.
    }
}

// Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
   int n = nums.length;
  int[] result = new int[n];        
  int i = 0, j = n - 1;            //taking 2 pointers
  for (int k = n - 1; k >= 0; k--) {
    int sqi = nums[i] * nums[i];    //square of elements
    int sqj = nums[j] * nums[j];
    if (sqi > sqj) {            //sorting the array using 2 pointers
      result[k] = sqi;
      i++;
    } else {
      result[k] = sqj;
      j--;
    }
  }
  return result;
    }
}
