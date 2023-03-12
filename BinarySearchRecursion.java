public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,11,20};
        int target=9;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int[] arr,int target,int s,int e )
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(target<arr[m])
        {
            search(arr,target,s,m-1);

        }

           return search(arr,target,m+1,e);

    }
}
