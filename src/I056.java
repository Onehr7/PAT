import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-30 12:47
 * function_:
 * summary
 **挺复杂的一道题，需要考虑的点很多
 * 二刷建议跳过
 **
 */
public class I056 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.print(num.charAt(0) == '+' ? "":"-");
        int i = 3;
        String nums = num.charAt(1)+"";
        while(num.charAt(i) >=48 && num.charAt(i) <= 57){
            nums +=num.charAt(i);
            i++;
        }
        i++;
        int j = i + 1;
        String a = "";
        while(j < num.length()){
            a += num.charAt(j);
            j++;
        }
        if(num.charAt(i)== '-'){
            String flag = "0.";
            for(j = 1; j < Integer.parseInt(a); j++){
                flag +="0";
            }
            System.out.println(flag+nums);
        }
        else{
            if(Integer.parseInt(a) < nums.length() - 1){
                for(i = 0; i < Integer.parseInt(a); i++){
                    System.out.print(nums.charAt(i));
                }
                System.out.print(".");
                while (i < nums.length()){
                    System.out.print(nums.charAt(i));
                    i++;
                }
            }
            else{
                String zero = "";
                for(i = 0; i < Integer.parseInt(a) - nums.length() + 1; i++){
                    zero += "0";
                }
                System.out.println(nums+zero);
            }
        }
    }
}
