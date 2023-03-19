public class NoIsOddOrEven {
    public static void main(String[] args)
    {
        int n=68;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n)
    {
        return(n & 1)==1;
    }
}
/*
Left shift operator-shifts all bits to the left side by one place
1010<<1=10100
all the numbers have shifted one place to the left
a<<1=2a
a<<b=a*2^b
 */

/*
Right shift operator
0011001>>1=001100
all the bits shift right by one place
a>>1=a/2
a>>b=a/(2^b)
 */

/*Odd or Even
if 2^0 place is 1 => number is odd
if 2^0 place is 0 => number is even
for this we use bitwise and with the given number
01110001
00000001
--------
00000001
this means number is odd

if(n & 1)==1 number is odd
if(n & 1)==0 number is even
 */
