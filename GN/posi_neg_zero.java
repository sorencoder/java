// Write a program to enter the numbers till the user wants and 
// at the end it should display the count of positive, negative and zeros entered
import java.util.*;
public class posi_neg_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int poscount=0,negcount=0,zerocount=0;
        int cond=0;
        
        while(cond!=2) {
            System.out.println("enter the number:");
            num=sc.nextInt();
            if (num>0) {
                poscount +=1;
            }else if(num<0){
                negcount+=1;
            }else{
                zerocount+=1;
            }
            System.out.println("enter '1' to continue");
            System.out.println("enter '2' to quit");
            cond=sc.nextInt();
        }
        System.out.println("positive number: "+poscount);
        System.out.println("negative number: "+negcount);
        System.out.println("zero number: "+zerocount);
        sc.close();
    }
}
