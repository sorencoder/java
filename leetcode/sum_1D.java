package leetcode;
import java.util.Arrays;

public class sum_1D {
    
    public static void sum(int[] arr) {
        int sum[] =new int[arr.length];
        // for (int i = 0; i < sum.length; i++) {
        //     int j = i;
        //     while (j>=0) {
                
        //         sum[i] = arr[j]+sum[i];
        //         j--;
        //     }
            
        // }
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i-1]+arr[i];
        }
       System.out.println(Arrays.toString(sum));
        
    }
    public static void main(String[] args) {
        long start = System.nanoTime();
        int arr[] = {1,2,3,4};
        sum(arr);
        long end = System.nanoTime();
        long totalTime = end-start;
        System.out.println(totalTime);

    }
}
