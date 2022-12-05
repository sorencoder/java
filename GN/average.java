// Enter 3 numbers from the user & make a function to print their average
import java.util.*;
public class average {

    static void avg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter any three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg(a,b,c);
        sc.close();
    }
}
