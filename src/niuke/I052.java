package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-30 08:39
 * function_:
 * summary:
 * *    1.题目整体要求度高，要注意的细节多
 * *    2. 5 != '5'
 * *    3. String.charAt(int index)
 * *    4. ASCII码
 */
public class I052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String common = "";
        int i;
        for(i = 0; i < Math.min(str1.length(),str2.length()); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                common+=str1.charAt(i);
            }
        }

        String day = "";
        int a = 0;
        int b = 1;
        i = 0;
        while(i < common.length()){
            if(common.charAt(i) >= 'A' && common.charAt(i) <= 'G'){
                a = i;
                break;
            }
            i++;
        }
        i++;
        while(i < common.length()){
            if((common.charAt(i) >= 48 && common.charAt(i) <= 57) || (common.charAt(i) >= 'A' && common.charAt(i) <= 'N')){
                b = i;
                break;
            }
            i++;
        }
        switch (common.charAt(a)){
            case 'A':
                day = "MON";
                break;
            case 'B':
                day = "TUE";
                break;
            case 'C':
                day = "WED";
                break;
            case 'D':
                day = "THU";
                break;
            case 'E':
                day = "FRI";
                break;
            case 'F':
                day = "SAT";
                break;
            case 'G':
                day = "SUN";
                break;
        }
        int hour = common.charAt(b) > 57 ? common.charAt(b) - 55 : common.charAt(b) - 48;
        str1 = br.readLine();
        str2 = br.readLine();
        common ="";
        for(i = 0; i < Math.min(str1.length(),str2.length()); i++){
            if(str1.charAt(i) == str2.charAt(i) && str1.charAt(i) >= 'A' && str1.charAt(i) <= 'z'){
                a = i;
                break;
            }
        }
        if(i<10){
            common = "0" + i;
        }
        else{
            common = "" + i;
        }
        String hours = "";
        if(hour < 10){
            hours = "0" + hour;
        }
        else{
            hours = "" + hour;
        }
        System.out.print(day+" "+hours+":"+common);
    }
}
