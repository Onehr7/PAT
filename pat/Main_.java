import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Main_ {

    /**
     * @param args
     */
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int []tree;
    static int []level;
    static int N=0;
    static double P=0;
    static double r=0;
    static int root=0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String []temp1=getInput().split(" ");
        N=Integer.parseInt(temp1[0]);
        P=Double.parseDouble(temp1[1]);
        r=Double.parseDouble(temp1[2]);
        tree=new int[N];
        level=new int[N];
        for(int i=0;i<N;i++)
        {
            level[i]=0;
        }
        String []temp2=getInput().split(" ");
        //init tree
        for(int i=0;i<N;i++)
        {
            tree[i]=Integer.parseInt(temp2[i]);
            if(tree[i]==-1)
                root=i;
        }
        level[root]=1;
//      setLevel(root);
        setLevel();
        DecimalFormat decimalFormat=(DecimalFormat) DecimalFormat.getInstance();
        String pattern="#.00";
        decimalFormat.applyPattern(pattern);
        int MaxDeep=1;
        for(int i=0;i<N;i++)
        {
            if(level[i]>MaxDeep)
                MaxDeep=level[i];
        }
        for(int i=1;i<MaxDeep;i++)
        {
            P=P*(1+r/100);
        }
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(level[i]==MaxDeep)
                count++;
        }
        System.out.print(decimalFormat.format(P)+" "+count);
    }



//  private static void setLevel(int root2) {
//      // TODO Auto-generated method stub
//      for(int i=0;i<N;i++)
//      {
//          if(tree[i]==root2)
//          {
//              level[i]=level[root2]+1;
//              setLevel(i);
//          }
//      }
//
//  }



    private static void setLevel() {
        // TODO Auto-generated method stub
        for(int i=0;i<N;i++)
        {
            if(i==root)
            {
                continue;
            }
            if(level[tree[i]]!=0)
            {
                level[i]=1+level[tree[i]];
            }
            else {
                setParentLevel(tree[i]);
                level[i]=1+level[tree[i]];
            }
        }
    }



    private static void setParentLevel(int i) {
        // TODO Auto-generated method stub
        if(level[tree[i]]!=0)
        {
            level[i]=1+level[tree[i]];
        }
        else {
            setParentLevel(tree[i]);
            level[i]=1+level[tree[i]];
        }
    }



    public static String getInput()
    {
        String string="";
        try {
            string=br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return string;
    }
}