// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sum_of_odd {
    static void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==1) {
                sum += i;
            }
           }
           System.out.println(sum); 

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Enter the value of n: ");
       n=sc.nextInt();
       sum(n);
       sc.close();
       
    }
}
