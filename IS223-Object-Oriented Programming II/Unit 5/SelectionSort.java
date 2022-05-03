import java.util.Arrays;
public class SelectionSort {
        
    void selectionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the firstelement
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
 
    public static void main(String args[])
    {
        SelectionSort sorter = new SelectionSort();
        int arr[] = { 44, 1489, 1, 683, 19, 743};
        //Print out the per-sorted array 
        System.out.println("Pre sorted array.");
        System.out.println(Arrays.toString(arr));
        
        //Sor the array using quick sort
        sorter.selectionSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}