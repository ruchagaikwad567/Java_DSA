public class ReverseTheNumberUsingRecursion {
    public static void main(String[] args) {
        Reverse(23789);
        System.out.println(sum);
        System.out.println(rev2(4289));

    }
    static int sum=0;
    public static void Reverse(int n)
    {

        if(n==0)
        {
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        Reverse(n/10);


    }
    static int rev2(int n)
    {
        //sometimes you might need some additional variables in the argument
        //in that case make another function called helper function
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);

    }

}

