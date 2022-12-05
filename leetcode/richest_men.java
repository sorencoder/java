package leetcode;

public class richest_men {
    public static void main(String[] args) {
        int arr[][] = {{7,1,3},{2,8,7},{1,9,5},{7,5,8}};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int bal =0;
            for (int j = 0; j < arr[i].length; j++) {
                bal = bal +arr[i][j];
            }
            if (max<bal) {
                max = bal;
            }
        }
        System.out.println(max);
    }
}
