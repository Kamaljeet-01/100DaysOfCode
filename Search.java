import java.util.Scanner;
import java.util.Arrays;
class Search {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Binary search
        Arrays.sort(arr);
        int target = sc.nextInt();
        int start = 0;
        int end = n;
        int mid = (start + end )/2;
        while(arr[mid] != target){
            mid = (start + end )/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }else if(arr[mid] > target){
                end = mid;
            }else if(arr[mid] < target){
                start = mid;
            }
        }
    }
}
