public class fibonacciNumbers {
    static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int x=7;
        System.out.println(fibo(x));

    }
}
