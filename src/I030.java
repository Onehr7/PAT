import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.wang
 * @date 2019-10-25 12:31
 * function_:
 */
public class I030 {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split("\\s");
        int n = Integer.parseInt(str[0]);
        List<Integer> list = new ArrayList<Integer>();
        int[] times = new int[n];

        //数组全初始化为1
        for(int j = 0; j < times.length; j++){
            times[j] = 1;
        }

        for(int i = 1;i <= n; i++){
            int num = Integer.parseInt(str[i]);
            if(!list.contains(num)) {
                list.add(num);
                times[list.size()-1] = 0;
            }
            else{
                //Important！！   存在的话将次数加一
                times[list.indexOf((Integer)num)]++;
            }
        }

        for(int j = 0; j < times.length; j++){
            if(times[j] == 0){
                System.out.println(list.get(j));
                return ;
            }
        }

        System.out.println("None");

    }
}

