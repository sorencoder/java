package sorting;

public class bubble_sort {

    // bubble_sort
    static void bubbleSorting(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
       
        bubbleSorting(arr);
        
        
    }
}
