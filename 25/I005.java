import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Mr.wang
 * @date 2019-11-05 09:42
 * function_:
 */
public class I005  {

    static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    static int maxNum = 1;
    static int maxLevel = 1;
    static int level = 1;
    static Queue<Integer> queue = new LinkedList<Integer>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        //初始化纵向list
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }

        //对横向list赋值
        for(int i = 0; i < m; i++){
            String[] fam = br.readLine().split(" ");
            List<Integer> listfam = list.get(Integer.parseInt(fam[0]));
            for(int j = 2; j < fam.length; j++){
                listfam.add(Integer.parseInt(fam[j]));
            }
        }
        BFS(1);
        System.out.print(maxNum+" ");
        System.out.print(maxLevel);
    }

    public static void BFS(int a){
        queue.offer(a);
        List<Integer> listfind ;


        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                listfind = list.get(queue.poll());

                for(int j = 0; j < listfind.size(); j++){
                    queue.offer(listfind.get(j));
                }
            }
            level++;
            if(maxNum < queue.size()){
                maxNum = queue.size();
                maxLevel = level;
            }

        }

    }
}
