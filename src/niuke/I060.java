package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-31 16:51
 * function_:
 * summary:
 * *    乱凑的答案，不想整理了
 * *    遇到了就哭⑧
 */
public class I060 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] nums = br.readLine().split("\\s");
        String[] num = nums[0].split("/");
        String[] num2 = nums[1].split("/");
        String[] num3 = new String[2];
        // +
        String out = toFormal(num) + " + " + toFormal(num2) + " = ";
        num3[0] = toInt(num[0]) * toInt(num2[1]) + toInt(num[1]) * toInt(num2[0])+"";
        num3[1] = toInt(num[1]) * toInt(num2[1]) +"";
        System.out.println(out + toFormal(num3));

        // -
        out = toFormal(num) + " - " + toFormal(num2) + " = ";
        num3[0] = toInt(num[0]) * toInt(num2[1]) - toInt(num[1]) * toInt(num2[0])+"";
        num3[1] = toInt(num[1]) * toInt(num2[1]) +"";
        System.out.println(out + toFormal(num3));

        // *
        out = toFormal(num) + " * " + toFormal(num2) + " = ";
        num3[0] = toInt(num[0]) * toInt(num2[0])+"";
        num3[1] = toInt(num[1]) * toInt(num2[1]) +"";
        System.out.println(out + toFormal(num3));

        // /
        out = toFormal(num) + " / " + toFormal(num2) + " = ";
        if(toInt(num2[0])==0){
            System.out.println(out + "Inf");
        }
        else{
            num3[0] = toInt(num[0]) * toInt(num2[1])+"";
            num3[1] = toInt(num[1]) * toInt(num2[0]) +"";
            System.out.println(out + toFormal(num3));
        }


    }
    public static int toInt(String c){
        return Integer.parseInt(c);
    }

    public static String toFormal(String[] num){
        String out = "";

        //除公约数
        int a = toInt(num[0]);
        int b = toInt(num[1]);
        if(a * b < 0){
            a = Math.abs(a)*(-1);
            b = Math.abs(b);
        }
        if(a < 0 && b < 0){
            a = Math.abs(a);
            b = Math.abs(b);
        }
        num[0] = a + "";
        num[1] = b + "";
        for(int i = 2; i <= Math.min(Math.abs(a),Math.abs(b)); i++){
            if((a % i == 0) && (b % i == 0)){
                num[0] = (a / i)+ "";
                num[1] = (b / i)+ "";
            }
        }

        if((toInt(num[0])/toInt(num[1]) != 0) || (toInt(num[0]) % toInt(num[1]) != 0)){
            if(toInt(num[0])/toInt(num[1]) > 0 ){
                out += (toInt(num[0])/toInt(num[1]));
                if(toInt(num[0]) % toInt(num[1]) != 0){
                    out+=" ";
                }
            }
            else if(toInt(num[0])/toInt(num[1]) <  0  || ((toInt(num[0]) % toInt(num[1])) < 0)){
                out += "(" ;
                if(toInt(num[0])/toInt(num[1]) !=  0){
                    out += (toInt(num[0])/toInt(num[1]));
                    if(toInt(num[0])%toInt(num[1]) !=  0){
                        out += " ";
                    }
                }

            }
        }
        else{
            out += 0;
        }

        if(toInt(num[0]) % toInt(num[1]) != 0){
            if(toInt(num[0]) / toInt(num[1]) == 0){
                out += toInt(num[0]) % toInt(num[1]) + "/" + toInt(num[1]);
            }
            else{
                out += Math.abs(toInt(num[0]) % toInt(num[1])) + "/" + toInt(num[1]);
            }

        }

        if(toInt(num[0])/toInt(num[1]) <  0 || toInt(num[0]) % toInt(num[1]) <  0){
            out += ")" ;
        }
        return out;
    }
}