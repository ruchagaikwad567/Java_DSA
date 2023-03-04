public class orderAgnosticBS {
    //ORDER AGNOSTIC SEARCH
//if the array is sorted in descending order then we need to reverse our operations
//to check that the array is sorted in ascending order or descending order we will compare start element and end element and then conclude if it is sorted in ascending order or descending order
public static void main(String[] args)
{
    int[] arr={1,-2,-3,-5,-10,-18};
    int target=-18;
    System.out.println(orderAgnosticBS(arr,target));

}
static int orderAgnosticBS(int[] arr,int target){
    int start=0;
    int end=arr.length-1;

    //find if array is sorted in ascending or descending
    boolean isAsc;
    if(arr[start]<arr[end])
    {
        isAsc=true;
    }
    else {
        isAsc=false;
    }

    while(start<=end)

    {
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(isAsc)
        {
            if(target<arr[mid])
            {
                end=mid-1;
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }
        }
        else {
            if(target<arr[mid])
            {
                start=mid+1;
            }
            else if(target>arr[mid])
            {
                end=mid-1;
            }
        }

    }
    return -1;


}

}
