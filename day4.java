import java.util.*;
public class day4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        int rem =0;
        while(number!=0){
            rem=number%10;
            number=number/10;
            reverse = reverse*10 + rem;
        }
        System.out.println(reverse);
    }
}