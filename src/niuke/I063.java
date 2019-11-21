package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-11-06 20:44
 * function_:
 */
public class I063 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int p = 0;
        int pa = 0;
        int pat = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == 'P'){
                p++;
            }
            else if(str.charAt(i) == 'A'){
                pa += p;
                pa %= 1000000007;
            }
            else{
                pat += pa;
                pat %= 1000000007;
            }
        }
        System.out.println(pat);
    }
}
