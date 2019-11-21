package niuke;

import java.io.*;
/**
 * @author Mr.wang
 * @date 2019-10-28 19:03
 * function_:
 */
public class I031 {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //turn the cards into the String[];
        String[] cards = new String[54];
        for(int i = 0; i < cards.length; i++){
            switch((i+1) / 13){
                case 0 :
                    cards[i] = "S" + (i+1) % 13;
                    break;

                case 1:
                    cards[i] = "H" + (i+1) % 13;
                    break;

                case 2:
                    cards[i] = "C" + (i+1) % 13;
                    break;

                case 3:
                    cards[i] = "D" + (i+1) % 13;
                    break;

                case 4:
                    cards[i] = "J" +(i + 1)% 13;
                    break;
            }
        }
        cards[12] = "S13";
        cards[25] = "H13";
        cards[38] = "C13";
        cards[51] = "D13";

        int times = Integer.parseInt(bf.readLine());
        String[] order = bf.readLine().split("\\s");
        String[] afterOrder = new String[54];
        for(int i = 0 ;i < order.length; i++){
            int flag = i;

            //find the order of  the cards after sorting
            for(int j = 0; j < times; j++){
                flag = Integer.parseInt(order[flag]) - 1;
            }
            afterOrder[flag] = cards[i];
        }

        System.out.print(afterOrder[0]);
        for(int i = 1; i < afterOrder.length ;i++){
            System.out.print(" "+afterOrder[i]);
        }
    }
}
