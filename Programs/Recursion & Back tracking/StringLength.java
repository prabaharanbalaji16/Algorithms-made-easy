public class StringLength {
    public static void main(String[] args) {
        int n=2, k=2;
        int arr[] = new int[n];
        LengthOfString(arr,n,k);
    }

    private static void LengthOfString(int arr[],int n, int k) {
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
            for(int i=0;i<k;i++)
            {
                arr[n-1]=i;
                LengthOfString(arr, n-1, k);
            }
        }
    }
}
