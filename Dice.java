import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        //you are given a die what are possible combinations of getting 4 on a die
        System.out.println(diceret("",4)) ;
    }
    static void dice(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=target;i++)
        {
            dice(p+i,target-i);

        }
    }

    static ArrayList<String> diceret(String p, int target)
    {
        if(target==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++)
        {

            ans.addAll(diceret(p+i,target-i));
        }
        return ans;
    }

    //if die has n faces
    static void diceface(String p,int target,int face)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=face && i<=target;i++)
        {
            diceface(p+i,target-i,face);

        }
    }

}
