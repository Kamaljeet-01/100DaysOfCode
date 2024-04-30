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


// Integer is Power of 4 or not ?  without loop

class Solution {
    public boolean isPowerOfFour(int n) {
   return n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
    }
}

//Sort Colors :

class Solution {
    public void sortColors(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}

// Find the winner of Array Game:

class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int winner = 0; // Index of the current winner
        int count = 0; // Consecutive wins for the winner

        // Two pointers: left (0) and right (1)
        for (int left = 0, right = 1; right < n; right++) {
            if (arr[left] < arr[right]) {
                winner = right; // Update winner if right element is larger
                count = 1; // Reset count for consecutive wins
                left = right; // Move left pointer to the new winner's position
            } else {
                count++; // Increment count if the current winner maintains lead
            }

            // Check for winner if current element is not the initial element (arr[0])
            if (count == k && arr[winner] != arr[0]) {
                return arr[winner]; // Return winner if consecutive wins reach k (excluding arr[0])
            }
        }

        // If loop completes, check for winner other than arr[0]
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[0]) {
                return arr[i]; // Return winner if any element is larger than arr[0]
            }
        }

        // If no winner found, return arr[0] (default winner)
        return arr[0];
    }
}

//Remove element:

class Solution {
    public int removeElement(int[] nums, int val) {
    int k = 0 ; // Initialize the counter for elements not equal to val
    for (int i=0;i<nums.length;i++){
        if (nums[i] != val){
            nums[k] = nums[i];
            k += 1;
            }
    }
    return k;
    }
}

//Array Rotation: (Overwriting method : Only for short length arrays ):

class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        while(i<k){
        int temp = nums[nums.length - 1];
        for(int j=nums.length - 1;j>0;j--){
            nums[j]=nums[j - 1];
        }
        nums[0]=temp;
        i++;
    } 
    }
}


//Add 2 number without using operators :

class Solution {
    public int getSum(int a, int b) {
		while (b != 0) {
			int sum = a ^ b; // XOR operation to calculate
							// sum without carry
			int carry
				= (a & b)
				<< 1; // AND and left shift operation to
						// calculate carry
			a = sum;
			b = carry;
		}
		return a;

    }
}

//Duplicate Elements in array:

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        // Restore nums array (optional)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicates;
    }
}

//Factorial of number using recursion:

import java.util.*;

class HelloWorld {
    public static int fac(int n){
        int factorial=1;
        if(n==0 || n==1){
            return 1;
        }else {
            factorial = n*fac(n - 1);
        }
        return factorial;
    }
    public static void main(String[] args) {
    int n; 
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    int result = fac(n);
    System.out.println(result);
    }
}


//Array Game: Error is there,will remove it soon.

class Solution {
    // array rotate
    public  void Rotate(int[] arr){  
        int temp=arr[1];    
	    for(int i=0;i<(arr.length - 1);i++){
		    arr[i]=arr[i+1];
	    }
        arr[arr.length -1] = temp;
    }
    public int getWinner(int[] arr, int k) {
    int count = 0 ; // winning count
    while(count < k){
        if(arr[1] > arr[0]){
	        Rotate(arr);
	        count=1;
        }else {
            Rotate(arr);
            int temp = arr[1];
            for(int i=1;i<arr.length - 1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length - 1]=temp;
            count++;
        }
    }
//returning winner
return arr[0];
    }
}

//Power of 4:
class Leetcode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num>1){
			if(num==1){
			break;}
			else{
				num=num/4;
				count++;
			}
		}
		System.out.println("Number you entered is 4 raised to power "+count);
	}
}
//EOF
