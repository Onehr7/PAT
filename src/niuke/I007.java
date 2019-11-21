package niuke;

import java.io.*;

/**
 * @author Mr.wang
 * @date 2019-10-23 18:54
 * function_:
 */
public class I007 {



    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());

        int total = 0;  //连续因子的总和
        int last = 1;   //连续的最后一位因子
        int flag = 0;   //排除质数
        for(int i = 2; i <= Math.sqrt(n); i++){

            int m = n;
            int j = i;
            while(m % j == 0){
                flag = 1;
                m = m / j;
                j++;
            }

            //当此数只有一个因子
            //顺序很重要，需要在下一个if之前
            if(total == 0 && j - i == 1){
                last = j;
            }

            if(total < j - i ){
                total = j - i ;
                last = j;
            }



        }
        if(flag==1){
            System.out.println(total);
            int first = last-total;
            System.out.print(first);
            first++;
            while(first < last){
                System.out.print("*"+(first++));
            }
        }

        //质数的情况
        else{
            System.out.println(1);
            System.out.println(n);
        }


    }
}
