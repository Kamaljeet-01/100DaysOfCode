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

//Simple Calculator :

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter an arithmetic expression (operand1 operator operand2) or 'q' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                exit = true;
                System.out.println("Exiting...");
                continue;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                System.out.println("Invalid input! Please provide an expression in the form of operand1 operator operand2.");
                continue;
            }

            int operand1, operand2;
            char operator;
            try {
                operand1 = Integer.parseInt(tokens[0]);
                operator = tokens[1].charAt(0);
                operand2 = Integer.parseInt(tokens[2]);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Invalid input! Please provide valid integers for operands.");
                continue;
            }

            int result;
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Invalid operator! Please use one of the following: +, -, *, /");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
