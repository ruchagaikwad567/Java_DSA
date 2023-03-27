import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    //in a matrix of 3x3. find no of ways in which a person can go from (1,1) to (3,3)
    public static void main(String[] args) {

        boolean[][] board= {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][]path=new int[board.length][board[0].length];

        allPathPrint("",board,0,0,path,1);
    }
    static int count(int r,int c){
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }

    static void path(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }

        if(r>1)
        {
            path(p+'D',r-1,c);
        }
        if(c>1)
        {
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathret(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1)
        {
            list.addAll(pathret(p+'D',r-1,c));
        }
        if(c>1)
        {
            list.addAll(pathret(p+'R',r,c-1));
        }
        return list;
    }

    //if you are allowed to go diagonally also
    static void diagonal(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;

        }
        if(r>1)
        {
            diagonal(p+'V',r-1,c);
        }
        if(c>1)
        {
            diagonal(p+'H',r,c-1);
        }
        if(r>1 && c>1)
        {
            diagonal(p+'D',r-1,c-1);
        }
    }
    static void pathRestriction(String p,boolean[][]maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;

        }
        if(!maze[r][c])
        {
            return;
        }
        if(r< maze.length-1)
        {
            pathRestriction(p+'D',maze,r+1,c);

        }
        if(c<maze[0].length-1)
        {
            pathRestriction(p+'R',maze,r,c+1);
        }
    }

    static void allPath(String p,boolean[][]maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;

        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1)
        {
            allPath(p+'D',maze,r+1,c);

        }
        if(c<maze[0].length-1)
        {
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0)
        {
            allPath(p+'U',maze,r-1,c);
        }
        if(c>0)
        {
            allPath(p+'L',maze,r,c-1);
        }

        //this is the line where function will be over
        //so before the function gets removed , remove all the changes made by that function
        maze[r][c]=true;
    }


    static void allPathPrint(String p,boolean[][]maze,int r,int c,int [][]path,int steps)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            for(int []arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;
        path[r][c]=steps;
        if(r< maze.length-1)
        {
            allPathPrint(p+'D',maze,r+1,c,path,steps+1);

        }
        if(c<maze[0].length-1)
        {
            allPathPrint(p+'R',maze,r,c+1,path,steps+1);
        }
        if(r>0)
        {
            allPathPrint(p+'U',maze,r-1,c,path,steps+1);
        }
        if(c>0)
        {
            allPathPrint(p+'L',maze,r,c-1,path,steps+1);
        }

        //this is the line where function will be over
        //so before the function gets removed , remove all the changes made by that function
        maze[r][c]=true;
        path[r][c]=0;
    }


}
