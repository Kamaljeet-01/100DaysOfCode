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
    }
}