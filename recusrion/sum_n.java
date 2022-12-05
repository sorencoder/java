package recusrion;

public class sum_n {
    public static void sumofN(int i,int n,int sum){
        if (i==n) {
            System.out.println(sum+n);
            return;
        }
        else{
            sum +=i;
            sumofN(i+1, n, sum);
            
        }
        
        
    }
    public static void main(String[] args) {
        int n=5;
        
        sumofN(1, n, 0);
    }
}
