public class Strings {
   /* public static void main(String[] args)
    {
        String series="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            series=series+ch;

        }
        System.out.println(series);
    }*/

    //In the above method every time a char is added to string, a new object is created. This leads to waste of memory.So we use string builder function.

    public static void main(String[] args)
    {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        //Stringbuilder is not creating new object, it is only updating the object.This is not immutable.it is mutable just like arrays.
    }
}
