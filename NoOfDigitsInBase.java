import org.w3c.dom.ls.LSOutput;

//Find number of digits in base
//first metthod is to do right shift operator till we get zero and keep a counter
//second is formula
//no of digits in base b of number n= int(log n base b) + 1
public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n=34567;
        int base=10;
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }


}
