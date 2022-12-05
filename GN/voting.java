
// Write a function that takes in age as input 
// and returns if that person is eligible to vote or not. 
// A person of age > 18 is eligible to vote
import java.util.*;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter the age: ");
        age = sc.nextInt();
        if (age > 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
        sc.close();

    }
}
