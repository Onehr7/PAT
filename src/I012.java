import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mr.wang
 * @date 2019-10-24 10:22
 * function_: 找出所有字符串中的相同结尾
 */
public class I012 {



    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String str1 = bf.readLine();
        String str2 = bf.readLine();

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        while(str1.charAt(i) == str2.charAt(j) && i!= 0 && j != 0){
            i--;
            j--;
            // if i or j == 0,the program will throw StringIndexOutOfBoundsException
        }

        i++;
        //i!=0时，会多减一个1

        if(i == 1){
            //当i=1时，i多加了一个1
            i = 0;
        }
        int m = str1.length() - i; //相同的总个数
        for(j = 2; j < n; j++){
            String strOther = bf.readLine();
            for(i = 0; i < m ;i++){
                if(strOther.charAt(strOther.length() - 1 - i) != str1.charAt(str1.length() - 1 - i)){
                    m = i;  //更新总个数
                }
            }
        }
        if(m == 0){
            System.out.println("nai");
        }
        else{
            for(i = 0; i < m; i++){
               System.out.print(str1.charAt(str1.length() - m + i));
            }
        }
    }
}
