public class elementOccuringOnce {

    public static void main(String[] args)
    {
        int[] arr={2,4,2,6,4};
        System.out.println(ans(arr));
        int[] arr2={-1,3,4,-3,1,5,-4};
        System.out.println(add(arr2));

    }
    //xor of any number with itself is zero
    private static int ans(int[] arr)
    {
        int unique=0;
        for(int n:arr)
        {
            unique^=n;
        }
        return unique;
    }

    //add all the numbers
    private static int add(int[] arr)
    {
        int sum=0;
        for(int n:arr)
        {
            sum+=n;
        }
        return sum;
    }
}
