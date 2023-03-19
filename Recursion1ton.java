public class Recursion1ton {
    public static void main(String[] args) {
        fun1(3);
        funRev(3);

    }
    public static void fun1(int n)
    {
        if(n>0)
        {
            fun1(n-1);
            System.out.println(n);
        }
    }

    public static void funRev(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            funRev(n-1);
        }
    }
}
/* print 1 to n
first line is function call and next line is print

print n to 1
second line is function call and first line is print

Concept of pass key
void fun(int n)
{
if(n==0){
return;
}
sout fun(n--);

using n-- will give infinite loop
so we use fun(--n)
this will give o/p=> 5 4 3 2 1
}
 */
