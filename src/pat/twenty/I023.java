package pat.twenty;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
/**
 * @author Mr.wang
 * @date 2019-11-04 21:44
 * function_:
 * summary:
 * *    1.注意最高位进位的情况
 */
public class I023 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        List<Integer> list = new ArrayList<Integer>();
        int flag = 0;

        for(int i = num.length() - 1; i >= 0; i--){
            int result = Integer.parseInt(num.charAt(i)+"") * 2 + flag;
            flag = result / 10;
            if(result / 10 == 0){
                list.add(result);
            }
            else{
                list.add(result % 10);
                flag = result / 10;
            }
        }

        if(flag!=0){
            list.add(flag);
        }
        for(int i = 0; i < num.length(); i++){
            if(!list.contains(Integer.parseInt(num.charAt(i)+""))){
                flag = -1;
            }
        }
        if(flag == -1 || list.size() != num.length()){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i)+"");
        }
    }
}
