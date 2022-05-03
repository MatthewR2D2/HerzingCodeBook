import java.util.Arrays;
public class InsertionSort {
        
    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
    }
    
 
    // Driver method to test above
    public static void main(String args[])
    {
        InsertionSort sorter = new InsertionSort();
        int arr[] = { 44, 1489, 1, 683, 19, 743};
        //Print out the per-sorted array 
        System.out.println("Pre sorted array.");
        System.out.println(Arrays.toString(arr));
        
        //Sor the array using bubble sort
        sorter.insertionSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}