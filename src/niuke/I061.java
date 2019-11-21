package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-11-07 15:34
 * function_:
 */
public class I061 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);
        str = br.readLine();
        String[] str1 = br.readLine().split(" ");

        int[] nums = new int[n];
        for(int i = 0; i < n ;i++){
            nums[i] = Integer.parseInt(str1[i]);
        }
        str1 = str.split(" ");
        int flag = 0;
        int k = 0;
        for(int i = n - 1; i > 1; i--){
            if(Integer.parseInt(str1[i]) != nums[i]){
                if(nums[i] > nums[i-1]){
                    flag = 1;
                }
                else{
                    flag = 0;
                }
            }
            else{
                k = i;
            }
        }

        System.out.println(flag == 0 ? "Merge Sort" : "Insertion Sort");

        if(flag == 1){
            int j = 0;
            while (nums[j] < nums[k]){
                System.out.print(nums[j]+" ");
                j++;
            }
            System.out.print(nums[k]+" ");
            System.out.print(nums[j]);
            for(int i = j + 1; i < n; i++){
                if(nums[i] != nums[k]){
                    System.out.print(" "+nums[i]);
                }
            }
        }
        else{
            for(int i = 0; i < n; i++){
                if(nums[i] > nums[i+1]){
                    k = i - k;
                }
            }
        }
    }
}
