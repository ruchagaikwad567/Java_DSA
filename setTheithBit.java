public class setTheithBit {
    public static void main(String[] args) {
        //set the ith bit means turn it to 1
        /*
        set the ith bit means 1->1
                              0->1
        if we want set the 5th bit of 0011011
        then OR it with 1

        0011011
        0000100
        -------
        0011111

         */

        //Reset ith bit
        /*means turn it to 0
        1->0
        0->0
        to reset the 5th bit of 1011101
        AND it with 0

        1011101
        1111011
        -------
        1011001
         */

        //find position of rightmost set bit
        /*
        it is the position of the 1 from the rightmost side
        11011010
              ^
              this is the set bit
       convert this into form a1b
       here a=110110, b=0
       we have to make a=0
       we make a(complement)1b
       and AND it with a1b
       Let N=a1b
          -N=a(complement)1b
       Ans = N &(-N)
         */

        /*Negative of a number
        negative of a number=2's complement of a number
        to find that -1)complement of a number
        2)add 1 to it

         */

        /*
        1byte=8bits
        10 will be stored as 00001010
                             ^      ^
                            MSB    LSB
                LSB tells if a number is odd or even , 0=>even 1=>odd
                MSB tells if a number is positive or negative, 0=>positive 1=>negative

                                    */

        /*Number of set bits in a given number
        if n=1001 no of set bits=2

         */
   /*     int n=2;
        int c=0;
        while(n>0)
        {
            if((n&1)==0)
            {
                c++;
            }
            n=n>>1;
        }
        System.out.println(c);

    }*/

        int n = 234567;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0) {
            count++;
            n = n & (n-1);
        }

        return count;
    }
}
