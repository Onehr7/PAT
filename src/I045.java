import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-29 19:38
 * summary
 * *    1.string.charAt(i) ,字符串中i处的字符
 * *    2.左边、右边尽可能等于下边，且小于下边
 * *    3.如果三边相等，则n1(左) = n3（右） = length / 3   n2（下） = length / 3 + 2
 * *    4.如果三边不相等，则n1(左) = n3（右） = length / 3   n2（下） = length / 3 + length % 3
 */
public class I045 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String space="";
        int i;
        if(str.length() % 3 == 0){
            for(i = 0; i < str.length() / 3 ; i++){
                space +=" ";
            }
            for(i = 0; i < str.length() / 3 - 1; i++){
                System.out.println(str.charAt(i) + space + str.charAt(str.length() - 1 - i));
            }
            System.out.println(str.substring(str.length() / 3 - 1 ,str.length() - str.length() / 3 + 1 ));
        }

        else{
            for(i = 0; i < str.length() / 3 + str.length() % 3 - 2; i++){
                space +=" ";
            }

            for(i = 0; i < str.length() / 3; i++){
                System.out.println(str.charAt(i)+space+str.charAt(str.length()-1-i));
            }

            System.out.println(str.substring(str.length() / 3 ,str.length() - str.length() / 3 ));
        }
    }
}

