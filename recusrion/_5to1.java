package recusrion;

public class _5to1 {
    static void recusrion(int n){
            System.out.println(n);
            n--;
           if (n>0) {
            recusrion(n);
           }      
    }
    public static void main(String[] args) {
        int n=5;
        recusrion(n);
    }
}
