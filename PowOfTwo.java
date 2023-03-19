
/*
Pascals Triangle
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Find sum of nth row

Sum of each row =nC0 + nC1 + nC2 + nC3 +....+nCn = 2^n
for nth row sum= 2^(n-1)
 */


/*
Power if a number
you are given a number ,find if it is power of 2 or not
100000 is pow of 2 bcoz no. of 1's is 1
100001 is not pow of 2 bcoz no. of 2's is 2

if n&(n-1)=0 then it is pow of 2
 */

/*Calculate a^b

 */
public class PowOfTwo {
    public static void main(String[] args) {
        int n=16;
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);

        int base=3;
        int pow=6;
        int ans2=1;
        while(pow>0)
        {
            if((pow&1)==1)
            {
ans2*=base;

            }
            base*=base;
            pow=pow>>1;


        }
        System.out.println(ans2);


    }
}
