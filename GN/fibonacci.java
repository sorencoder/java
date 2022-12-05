// Write a program to print Fibonacci series of n terms where n is input by user
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int a=0,b=1,c=0;
        System.out.println("enter the value of n: ");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        sc.close();

    }
}
