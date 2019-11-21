package pat.twenty;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-11-04 11:11
 * function_:
 */
public class I005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        long total = 0;
        for(int i = 0; i < num.length(); i++){
            total += Integer.parseInt(num.charAt(i)+"");
        }
        num = total +"";
        System.out.print(numToString(num.charAt(0)));
        for(int i = 1; i < num.length(); i++){
            System.out.print(" "+numToString(num.charAt(i)));
        }
    }
    public static String numToString(char num){
        switch (num){
            case '1':
                return "one";

            case '2':
                return "two";

            case '3':
                return "three";

            case '4':
                return "four";

            case '5':
                return "five";

            case '6':
                return "six";

            case '7':
                return "seven";

            case '8':
                return "eight";

            case '9':
                return "nine";

            case '0':
                return "zero";

            default:
                return "";
        }

    }
}