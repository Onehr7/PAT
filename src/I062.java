import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.wang
 * @date 2019-10-30 10:40
 * function_:
 * summary
 * *    1.将需要购买的存入List
 * *    2.将商店有的进行遍历，如果存在则从list中移除，不存在则为N0，并对不存在进行计数
 * *    3.不为NO时，list.size()则为还需购买的
 */
public class I062 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        List<Character> list = new ArrayList<Character>();
        for(int i = 0; i < str1.length(); i++){
            list.add(str1.charAt(i));
        }
        str1 = br.readLine();
        int no = 0;
        int yse = 0;
        for(int i = 0; i < str1.length(); i++){
            if(!list.contains(str1.charAt(i))){
                no++;
            }
            else{
                list.remove(list.indexOf(str1.charAt(i)));
            }
        }
        if(no > 0){
            System.out.println("No "+no);
        }
        else{
            System.out.println("Yes "+list.size());
        }
    }
}
