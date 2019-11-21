package niuke;

import java.io.*;
import java.util.Arrays;

/**
 * @author Mr.wang
 * @date 2019-10-31 08:00
 * function_:
 * summary:
 * *    1.字符串的标准输出 String.format(),其中对数字标准输出并补零String.format("%04d",d)表示不足四位时，在前方补零
 */
public class I054 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.length() == 4){
            if(str.charAt(0) == str.charAt(1) && str.charAt(2)==str.charAt(3) && str.charAt(1)==str.charAt(2)){
                System.out.println(str+" - "+str+" = 0000");
                return;
            }
        }
        while(!str.equals("6174")){
            str = find(str);
        }
    }
    public static String find(String num){
        char[] a = new char[4];

        for(int i = 0; i < 4; i++){
            if(i < num.length()){
                a[i] = num.charAt(i);
            }
            else{
                a[i] = '0';
            }
        }
        Arrays.sort(a);
        int number1 = (a[3]-48) + (a[2] - 48) * 10 + (a[1] - 48) * 100 + (a[0] - 48)*1000;
        int number2 = (a[3]-48) * 1000 + (a[2] - 48) * 100 + (a[1] - 48) * 10 + (a[0] - 48);
        System.out.println(String.format("%04d",number2)+" - "+String.format("%04d",number1)+" = "+String.format("%04d",(number2-number1)));
        return (number2 - number1)+"";
    }
}
