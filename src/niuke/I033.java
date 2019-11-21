package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-11-07 22:21
 * function_:
 */
public class I033 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[2]);

        num = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(num[i]);
        }

        int pay = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n;j++){
//                if()
            }
        }
    }
}
