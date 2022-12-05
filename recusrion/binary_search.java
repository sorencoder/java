package recusrion;
public class binary_search {
    // insertion_sort
    static void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        
    }
    // binary_search
    static void binarySearch(int arr[],int low,int high,int sr){
        int mid;     
        if (low>high) {
            System.out.println("element not found");
        }
        else{
            mid = (low+high)/2;
            if (sr == arr[mid]) {
                System.out.println("element found");
                // System.out.println(sr);
            }
            else if (sr>arr[mid]) {
            binarySearch(arr, mid+1, high, sr);
            }
            else{
                binarySearch(arr, low, mid-1, sr);
            }
        }
            
        
       
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int low = 0,high = 4;
        int sr = 2;
        insertionSort(arr);
        binarySearch(arr, low, high, sr);
        
    }
}
