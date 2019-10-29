import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.wang
 * @date 2019-10-29 13:35
 * function_:
 *  summary
 * *    1. String.toCharArray 将string字符串转化为char数组
 * *    2. list.contains(obj) 查询list中是否包含obj
 * *    3. list.remove(<E> obj) 删除list中指定obj
 */
public class I039 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = bf.readLine().toCharArray();
        char[] str2 = bf.readLine().toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(char str : str1){
            list.add(str);
        }

        for(int i = 0; i < str2.length; i++){
            while (list.contains(str2[i])){
                list.remove((Character)str2[i]);
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
