// Write a function that calculates the Greatest Common Divisor of 2 numbers
// old method
// import java.util.*;
import java.lang.Math;
public class GCD_old {
    static void gcd(int a, int b){
        int result = Math.min(a, b);
        // int i=0;
        while (result>0) {
            // i++;
            // System.out.println(i);
            if (a%result == 0 && b%result==0) {
                break;
            }
            result--;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Scanner sc = new Scanner(System.in);
        int num1=98,num2=56;
        // System.out.println("enter any two numbers: ");
        // num1=sc.nextInt();
        // num2=sc.nextInt();
        gcd(num1, num2);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println((elapsedTime/1000)%60);
        // sc.close();
    }
}
