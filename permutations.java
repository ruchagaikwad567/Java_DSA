import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
    //perm("abc","");
        System.out.println(permutationCount("abcf",""));
    }
    static void perm(String up,String p)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            perm(up.substring(1),f+ch+s);
        }
    }

    static ArrayList<String> permutation(String up,String p)
    {
        if(up.isEmpty())
        {
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }

        char ch=up.charAt(0);
        ArrayList<String>list=new ArrayList<>();


        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            list.addAll(permutation(up.substring(1),f+ch+s));


        }
        return list;
    }
    static int permutationCount(String up,String p)
    {
        if(up.isEmpty())
        {
            return 1;}

        int count=0;
            char ch=up.charAt(0);
            for(int i=0;i<=p.length();i++)
            { String f=p.substring(0,i);
                String s=p.substring(i,p.length());
                count+=permutationCount(up.substring(1),f+ch+s);

            }
            return count;

    }
}
