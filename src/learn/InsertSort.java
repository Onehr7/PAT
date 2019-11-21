package learn;

/**
 * @author Mr.wang
 * @date 2019-11-07 15:07
 * function_:
 */
public class InsertSort {
    public static void insertSort(int [] list){
        for(int i = 1;i < list.length; i++){
            int tmp = list[i];
            int k;

            //将比现在大的元素向后移
            for(k = i; k > 0 && list[k-1] > tmp; k--){
                list[k] = list[k - 1];
            }
            list[k] = tmp;
        }
    }
    public static void main(String[] args) {
        int [] list = {29,10,14,37,14};
        insertSort(list);
        for(int a : list){
            System.out.print(a+" ");
        }
    }
}
