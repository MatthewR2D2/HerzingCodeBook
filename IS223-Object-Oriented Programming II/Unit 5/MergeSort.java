import java.util.Arrays;
public class MergeSort {
        
    void merge(int arr[], int l, int m, int r){
        // Find sizes of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Temp arrays for sorting
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        // Initial indexes of the subarrays
        int i = 0;
        int j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
  
            // Merge the halves
            merge(arr, l, m, r);
        }
    }
    
 
    // Driver method to test above
    public static void main(String args[])
    {
        MergeSort sorter = new MergeSort();
        int arr[] = { 44, 1489, 1, 683, 19, 743};
        //Print out the per-sorted array 
        System.out.println("Pre sorted array.");
        System.out.println(Arrays.toString(arr));
        
        //Sor the array using merge sort
        sorter.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}