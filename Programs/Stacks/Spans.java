package Stacks;

public class Spans {

    public static void main(String[] args) {
        int arr[] = {6,3,4,5,2};
        Spans spans = new Spans();
        spans.execute(arr);
    }

    void execute(int[] arr)
    {
        int[] spans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int span = 1;
            int j=i-1;

            while(j>=0 && arr[j]<=arr[j+1])
            {
                span++;
                j--;
            }
            spans[i]=span;
        }

        for(int i:spans)
        {
            System.out.println(i);
        }
    }
}
