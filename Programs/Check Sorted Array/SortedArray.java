public class SortedArray {
    public static void CheckSortedArray(int arr[], int length)
    {
        if(length==0)
        {
            System.out.println("Array is sorted");
            return;
        }
        if(arr[length]>arr[length-1])
            CheckSortedArray(arr, length-1);
        else
            System.out.println("Not Sorted");

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        CheckSortedArray(arr,arr.length-1);
    }
    
}

// Time - O(n)