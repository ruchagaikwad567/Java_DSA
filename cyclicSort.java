import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args)
    {
        int[] arr={3,5,4,1,2,6,9,8,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr)
    {
    int i=0;
    while(i<arr.length){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct])
        {
            swap(arr,i,correct);

        }
        else{
            i++;
        }

    }}
    static void swap(int[]arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
