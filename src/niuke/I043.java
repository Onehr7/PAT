package niuke;

import java.util.Arrays;
import java.util.Scanner;

public class I043 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] img = new int[m*n];
        int i = 0;
        while(sc.hasNext()){
            img[i++] = sc.nextInt();
        }

        Arrays.sort(img);

        System.out.println(img[m*n/2]);

    }
}
