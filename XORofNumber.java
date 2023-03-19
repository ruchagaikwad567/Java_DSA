
//find XOR of numbers from 0 to a
/*
if a%4==0 ans=a
if a%4==1 ans=1
if a%4==2 ans=a+1
if a%4==3 ans=0
 */

/*XOR of all numbers between a and b
XOR(b) ^ XOR(a-1)
 */
public class XORofNumber {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans= xor(b)^xor(a-1);
        System.out.println(ans);

        int ans2=0;
        for(int i=a;i<=b;i++)
        {
            ans2^=i;
        }

    }
    private static int xor(int a)
    {
        if(a%4==0)
        {
            return a;
        }
        else if(a%4==1)
        {
            return 1;
        }
        else if(a%4==3)
        {
            return a+1;
        }
        return 0;
    }
}
