// Write a function which takes in 2 numbers and returns the greater of those two
import java.util.*;

public class greater_of_two {
    
    static void greaterNum(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter any two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b) {
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
        sc.close();
    }
    public static void main(String[] args) {
        greaterNum();
        
        
    }
}
