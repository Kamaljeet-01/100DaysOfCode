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


//Problem Of the Day 
//Finding the Pivot Integer:

class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int sum1=0;
            int sum2=0;
            //for left sum
            for(int j=1;j<i;j++){
                sum1+=j;
            }
            //for right sum
            for(int k=(i + 1);k<=n;k++){
                sum2+=k;
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}

//updates code for Pivot integer :

class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            int rightSum = totalSum - i - leftSum; // Calculate right sum
            if (leftSum == rightSum) {
                return i; // Found the pivot
            }
            leftSum += i; // Update left sum for the next iteration
        }
        return -1; // No pivot found
    }
}

// Search Insert Position :

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}


//Product of Array Except Self :

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate prefix products and store them in the result array
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        int suffixProduct = 1;
        // Calculate suffix products and multiply them with prefix products stored in result array
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return result;
    }
}

//
Find square root without using pow() :

class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (mid > x / mid) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }
}
