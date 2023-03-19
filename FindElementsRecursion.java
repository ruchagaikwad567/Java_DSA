public class FindElementsRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,3,45,67};

        System.out.println(find(arr,25,0));
    }
    static boolean find(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}
