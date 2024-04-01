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


// Merge two arrays into another one and sort it:

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
    int m=sc.nextInt();
    int[] arr = new int[n];
    int[] arr2 = new int[m];
    int s=n+m;
    int count=0;
  int[] arr3 = new int[s];
  for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
  }
  for(int i=0;i<m;i++){
      arr2[i]=sc.nextInt();
  }
  for(int i=0;i<s;i++){
      if(i<n){
      arr3[i]=arr[i];
  }
     else if(i>=n){
          arr3[i]=arr2[count];
          count++;
      }
  }
  for(int i=0;i<s;i++){
      System.out.print(arr3[i]+" ");
  }

    }
}


//Stack Question without implementing Stack. (will edit later):

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[] arr = new int[10];
    
int n;

int count =9 ;
while(true){
   n = sc.nextInt(); 
int a;

if(n==1){
    a = sc.nextInt();
    arr[count]=a;
    count--;
    System.out.println("Element "+a+" pushed onto the stack.");
    
}
    else if(n==2){
        if(count<=9 || arr[count]!=0){
        System.out.println("Element "+arr[count + 1]+" Popped from the stack.");
        arr[count + 1]=0;
        count++;}
        else if(count>9){
            System.out.println("Stack Underflow. Cannot perform pop operation.");
        }
    }
    else if(n==3){
        if(count == 9){
            System.out.println("Stack is empty.");
        }
        else {
        System.out.println("Elements in the stack: ");
        for(int i=0;i<10;i++){
            if(arr[i] != 0){
            System.out.print(arr[i]+ " ");}
        }
        System.out.println();}
    }
    else if(n==4){
        System.out.println("Exiting the program.");
        break;
    }
    else{
        System.out.println("Invalid choice.");
    }
     
    
}
    }
}
