public class ithBitOfNo {
    //if we want what is 4th bit of 10010011
    //then we will keep only 4th bit as it is and turn all other bits to zero 00010000
    //to find this number we use left shift operator with 1 for 4 places as this will shift 1 to the 5th place from last
    //for this we perform and operation of given no with 00010000<- this number is called mask
    //this is called masking.
    //actually here we will be masking with n-1 zeros
    //1<<4 will give 10000=>00010000
    // answer is n & (1<<(n-1))

    public static void main(String[] args)
    {

    }
}
