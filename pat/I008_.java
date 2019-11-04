import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-31 22:15
 * function_:
 */
public class I008_ {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] nums = str.split("\\s");
        int time = 0;
        time = time + toInt(nums[1]) * 6 + 5;
        for(int i = 2; i < nums.length; i++){
            if(toInt(nums[i]) > toInt(nums[i-1])){
                time = time + (toInt(nums[i]) - toInt(nums[i - 1])) * 6 + 5;
            }
            else{
                time += (toInt(nums[i - 1]) - toInt(nums[i])) * 4 + 5;
            }
        }
        System.out.println(time);
    }
    public static int toInt(String a){
        return Integer.parseInt(a);
    }
}
