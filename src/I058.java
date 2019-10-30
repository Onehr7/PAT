import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

/**
 * @author Mr.wang
 * @date 2019-10-30 16:15
 * function_:
 * summary:
 * *    1. 使用list较为简单
 * *    2. 小写字母转大小字母（char-32）
 * *    3. list.remove(obj)去重
 */
public class I058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> list = new ArrayList<Character>();
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }

        str = br.readLine();
        for(int i = 0; i < str.length(); i++){
            while (list.contains(str.charAt(i))){
                list.remove((Character) str.charAt(i));
            }
        }

        str = "";

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= 97 && list.get(i)<= 122) {
                list.set(i, (char) (list.get(i) - 32));
            }
            str+=list.get(i);
        }

        while (!list.isEmpty()){
            list.remove(0);
        }
         for(int i = 0; i < str.length(); i++){
             if(!list.contains(str.charAt(i))){
                 list.add(str.charAt(i));
             }
         }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
