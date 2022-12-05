package leetcode;

public class steps_to_zero {
    public static void stepsToZero(int n){
        int f=0;
        while (n>0) {
            if (n%2==0) {
                n=n/2;
                f+=1;
            }
            else{
                n-=1;
                f+=1;
            }
        }
        System.out.println(f);
        
    }
    public static void main(String[] args) {
        int n= 14;
        stepsToZero(n);
    }
}
