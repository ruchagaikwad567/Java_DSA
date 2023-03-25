import org.w3c.dom.ls.LSOutput;
//remove all the a's from the string

import java.util.Scanner;

public class strque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        skip(str,"")
;    }
    public static void skip(String up,String p)
    {
       if(up.isEmpty())
       {
           System.out.println(p);
           return;
       }
       char ch=up.charAt(0);

       if(ch=='a')
       {
           skip(up.substring(1),p);
       }
       else{
           skip(up.substring(1),p+ch);
       }
    }

}
