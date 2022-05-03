import java.util.Arrays;
public class QuickSort {
        
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
 
    public static void main(String args[])
    {
        QuickSort sorter = new QuickSort();
        int arr[] = { 44, 1489, 1, 683, 19, 743};
        //Print out the per-sorted array 
        System.out.println("Pre sorted array.");
        System.out.println(Arrays.toString(arr));
        
        //Sor the array using quick sort
        sorter.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}