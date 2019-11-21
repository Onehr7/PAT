package niuke;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.*;

/**
 * @author Mr.wang
 * @date 2019-11-05 12:42
 * function_:
 */
public class I003 {

    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] nums = br.readLine().split(" ");
        double price = Double.parseDouble(nums[1]);
        double rate = Double.parseDouble(nums[2]);

        nums = br.readLine().split(" ");
        //初始化list
        for(int i = 0; i <= nums.length; i++){
            list.add(new ArrayList<>());
        }


        for(int i = 0; i < nums.length; i++){
            List<Integer> listChain;
            if(Integer.parseInt(nums[i]) == -1){
                listChain = list.get(nums.length);
            }
            else{
                listChain = list.get(Integer.parseInt(nums[i]));
            }
            listChain.add(i);
        }
        String result = DFS(list.get(nums.length).get(0));
        int i = Integer.parseInt(result.charAt(1)+"");
        while (i > 1){
            price = price * (1 + rate * 0.01);
            i--;
        }
        System.out.printf("%.2f %s",price,result.charAt(0));
    }
    public static String DFS(int a){
        int deep = 1;
        int num = 0;
        int maxDeep = 0;
        List<Integer> list1;
        queue.offer(a);

        while(!queue.isEmpty()){
            int size = queue.size();
            int flag = queue.peek();
            for(int i = 0; i < size; i++){
                list1 = list.get(queue.poll());

                for(int j = 0; j < list1.size(); j++){
                    queue.offer(list1.get(j));
                }
            }
            if(queue.peek()!=null && flag != queue.peek()){
                deep++;
            }
            if(maxDeep < deep){
                maxDeep = deep;
                num = queue.size();
            }

        }

        return num + "" + maxDeep;
    }
}
