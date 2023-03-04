public class binarySearch {
    public static void main(String[] args){
        int[] arr={-10,-4,0,3,5,29,45,90};
        System.out.println(binarySearch(arr,29));
    }

    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //int mid=(start+end)/2
            //we dont use above formula coz the value of start+end might exceed the integer range
            int mid=start + (end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target==arr[mid])
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
        }
        return -1;

    }

}

