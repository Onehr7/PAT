import java.io.*;

/**
 * @author Mr.wang
 * @date 2019-10-24 16:30
 * function_:
 */
public class I023 {
    public static void main(String[] args) throws IOException{
        int t;
        long a,b,c;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(bf.readLine());
        boolean booleans ;
        int i;
        Long[] num = new Long[3];
        for(i = 0;i < t; i++){
            String s = bf.readLine();
            String[] number = s.split("\\s");
            int j = 0;
            for(String array:number){
                num[j++]=Long.parseLong(array);
            }
            a = num[0];
            b = num[1];
            c = num[2];
            booleans = judge(a,b,c);
            System.out.println("Case #"+(i + 1)+":"+" "+booleans);
        }



    }

    public static boolean judge(long a, long b,long c){
        long i = a >> 1;
        long j = b >> 1;
        long k = c >> 1;
        //精度丢失的情况
        if(i + j == k){
            if((a & 1) + (b & 1) > (c & 1)){ //(1 1 0)(1 1 1)(1 0 0)
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(a + b == c){
                return false;
            }
            else{
                return (i + j) > k;
            }

        }
    }
}
