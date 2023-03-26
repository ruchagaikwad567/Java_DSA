public class LetterCombinationOfPhoneNo {
    public static void main(String[] args) {
pad("12","");
    }

    static void pad(String up,String p)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            pad(up.substring(1),p+ch);
        }
    }
}
