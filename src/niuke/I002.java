package niuke;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.wang
 * @date 2019-11-13 14:07
 * function_:注意正负相抵后0不输出；
 */
public class I002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Double> map = new HashMap<>();

        String[] num1 = br.readLine().split(" ");
        for(int i = 1; i < num1.length - 1; i=i+2){
            map.put(Integer.parseInt(num1[i]),Double.parseDouble(num1[i+1]));
        }

        num1 = br.readLine().split(" ");
        for(int i = 1; i < num1.length - 1; i=i+2){
            if(map.containsKey(Integer.parseInt(num1[i]))){
                Double doublenumber = map.get(Integer.parseInt(num1[i]));

                //防止正负相抵的情况
                if((Double.parseDouble(num1[i+1]) + doublenumber) != 0){
                    map.put(Integer.parseInt(num1[i]),Double.parseDouble(num1[i+1]) + doublenumber);
                }
                else{
                    map.remove(Integer.parseInt(num1[i]));
                }

            }
            else{
                map.put(Integer.parseInt(num1[i]),Double.parseDouble(num1[i+1]));
            }
        }

        System.out.print(map.size());
        double[] result = new double[2*map.size()];
        int j = 2*map.size() - 1;
        for(int a : map.keySet()){
            result[j] = map.get(a);
            result[j - 1] = a;
            j = j - 2;
        }

        for(int i = 0; i < result.length; i = i + 2){
            System.out.print(" " + (int)result[i]+" " + String.format("%.1f",result[i + 1]));
        }
    }
}
