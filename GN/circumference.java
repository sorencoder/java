// Write a function that takes in the radius as input and returns the circumference of a circle
import java.util.*;
public class circumference{
    static void circle(int r){
        double pi = 3.14;
        double circum = 2*r*pi;
        System.out.println(circum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("enter the radius of the circle: ");
        r=sc.nextInt();
        circle(r);
        sc.close();
    }
}