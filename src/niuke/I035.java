package niuke;

import java.io.*;
import java.util.Scanner;

/**
 * @author Mr.wang
 * @date 2019-10-29 08:13
 * function_:
 * summary
 * *    1.使用BufferedReader比Scanner时间效率高很多，但可能内存上可能会超出
 * *    2.两点间的距离一共有两种情况，两种情况之和为总距离
 * *    3.算出从小到大的距离，另一个距离为总距离减此距离，比较两种距离的大小
 */
public class I035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] distence = new int[n];
        int total = 0;
        for(i = 0; i < n; i++){
            distence[i] = sc.nextInt();
            total +=distence[i];
        }

        int m = sc.nextInt();

        for(i = 0; i < m; i++){
            int flag;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                flag = a;
                a = b;
                b = flag;
            }
            int result = 0;
            while (a < b){
                result += distence[a-1];
                a++;
            }
            System.out.println(result > total/2 ? total - result : result);
        }
    }
}
