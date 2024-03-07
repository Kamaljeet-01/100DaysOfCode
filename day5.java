import java.util.*;
public class day5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        //Taking array input:
        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }
        //checking for even number in array:
        for(int j=0;j<len;j++){
            if(arr[j]%2 == 0){
                System.out.print(arr[j]+" ");
            }else continue;
        }
        System.out.println();                   //to print next line after printing the numbers
        //deletion of element in array:
        int key = scanner.nextInt();
        for(int i=key ;i<len- 1 ;i++){
            arr[i]=arr[i + 1];
        }
        //display the updated array:
        for(int i=0;i<len - 1;i++){
            System.out.print(arr[i]+" ");
        }

// Leetcode Question :
//finding first and last appearance of element in sorted array:
        
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count = 0;
        int[] arr = new int[2];
        //int first,second;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && count == 0){ 
            arr[0] = i;
            count++;
            }
            else if(nums[i] == target && count != 0){
                count++;
                arr[1] = i;
            }
        }if(count == 0){
            arr[0] = -1;
            arr[1] = -1;
        }else if(count == 1){
            arr[1]=arr[0];
        }
        return arr;

    }
}
    }
}
