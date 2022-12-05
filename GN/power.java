// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. x^n
import java.util.*;
import java.lang.Math;
public class power {

    // power without using func
    public static void powerofNum(int x,int n){
        int pow =1;
        for (int i = 1; i <= n; i++) {
            pow = pow*x;
        }
        System.out.println(pow);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x;
        System.out.println("enter the value of x");
        x=sc.nextInt();
        System.out.println("enter the value of n");
        n=sc.nextInt();

        // power using func
        double result = Math.pow(x, n);
        System.out.println(result);
        
        powerofNum(x, n);
        sc.close();
    }
}
