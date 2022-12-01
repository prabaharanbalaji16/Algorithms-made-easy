public class GenerateBinary {
    public static void main(String[] args) {
        int n=3;
        int arr[] = new int[n];
        StringBits(arr,n);
    }

    public static void StringBits(int arr[],int n) {
        if(n<1)
        {
            for(int a:arr)
            {
                System.out.print(a);
            }
            System.out.println();
        }
        else
        {
            arr[n-1]=0;

            StringBits(arr, n-1);

            arr[n-1]=1;

            StringBits(arr, n-1);
        }

    }

}

// Time - O(2^n)