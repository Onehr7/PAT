package pat.twenty;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-11-21 20:06
 * function_:World Cup Betting
 */
public class I011 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] max = new double[]{0,0,0};
        int[] location = new int[3];
        for(int i = 0; i < 3; i++){
            String[] odds = br.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                if (Double.parseDouble(odds[j]) > max[i]){
                    max[i] = Double.parseDouble(odds[j]);
                    location[i] = j;
                }
            }
        }
        for(int a : location){
            char str = ' ';
            switch (a){
                case 0:
                    str = 'W';
                    break;
                case 1:
                    str = 'T';
                    break;
                case 2:
                    str = 'L';
                    break;
            }
            System.out.print(str+" ");
        }
        double win = 1;
        for(double b : max){
            win *=b;
        }
        win = (win * 0.65 - 1) * 2;
        System.out.println(String.format("%.2f",win));
    }
}
