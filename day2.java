import java.util.*;

//Linear Search in array:


public class  day2{
    public static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int number = sc.nextInt();
        int[] arr = new int[number];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<number;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number you want to search : ");
        int key = sc.nextInt();
        //Linear Search function call:
        System.out.println("Key found at index : "+linearSearch(arr,key));
        

    }
}