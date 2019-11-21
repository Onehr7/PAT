package niuke;

import java.io.*;

/**
 * @author Mr.wang
 * @date 2019-10-24 12:03
 * function_:
 * point:
 *      -String.split()(分割为字符串数组)
 *      -正则表达式
 *      -字符串转换Integer.parseInt()
 */
public class I018{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String cut = " ";
        String[] str1 = str.split(cut);

        String[] number1 = str1[0].split("\\.");
        String[] number2 = str1[1].split("\\.");

        int i = (Integer.parseInt(number1[2]) + Integer.parseInt(number2[2]));//3总
        int j = (i/29 + Integer.parseInt(number1[1]) + Integer.parseInt(number2[1])) ;//2总
        int k = j/17 + Integer.parseInt(number1[0]) + Integer.parseInt(number2[0]);//1总
        System.out.println(k+"."+j%17+"."+i%29);
    }
}
