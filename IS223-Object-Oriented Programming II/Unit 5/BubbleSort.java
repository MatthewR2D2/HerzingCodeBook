import java.util.Arrays;
public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
				// If element at j is larger than element at i swap the values
                if (arr[j] > arr[j + 1]) {
                    // swap indexes
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort sorter = new BubbleSort();
        int arr[] = { 44, 1489, 1, 683, 19, 743};
        //Print out the per-sorted array 
        System.out.println("Pre sorted array.");
        System.out.println(Arrays.toString(arr));
        
        //Sor the array using bubble sort
        sorter.bubbleSort(arr);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}