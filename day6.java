class day6{
    public static void main(String[] args){
//
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        // sorting an array:
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[i]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        //printing array:
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

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


//Duplicate element in array :
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        //Finding duplicate  2 5 3 5 5
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i > j && arr[i]==arr[j] ){
                    //System.out.println(arr[i]);
                    break;
                }else if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        
    }
}
