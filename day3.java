import java.util.*;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = (nums1.length + nums2.length) ;
        int[] nums3 = new int[len];
        for(int i=0;i<len;i++){
            if(i < nums1.length){
                nums3[i]= nums1[i];
            }else{
                nums3[i]=nums2[i - nums1.length]; 
            }
        }
        Arrays.sort(nums3);
        double median=0.0d;
        int mid=len/2;
        
        if((len)%2==0){
            median =(nums3[mid - 1] + nums3[mid])/2.0;
        }else if((len)%2!=0){
            median = nums3[mid];  
        }
        return median;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(system.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        //taking input of 1st array :
        for(int i=0;i<n;i++){
            nums1=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            nums2=sc.nextInt();
        }
        findMedianSortedArrays(nums1, nums2);

    }
}