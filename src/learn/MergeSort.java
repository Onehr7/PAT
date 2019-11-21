package learn;

/**
 * @author Mr.wang
 * @date 2019-11-07 09:11
 * function_:归并排序
 */
public class MergeSort {
    public static void main(String[] args){
        MergeSort m = new MergeSort();
        int[] a = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[a.length];
        m.mergeSort(a, 0, a.length - 1, tmp);
        for(int n : a){
            System.out.print(n + " ");
        }
    }

    public void merge(int[] a, int left, int mid, int right, int[] tmp){
        int le = left;
        int m = mid + 1;
        int i = 0;
        while (le <= mid && m <= right){
            if (a[le] < a[m]){
                tmp[i++] = a[le++];
            }
            else{
                tmp[i++] = a[m++];
            }
        }

        //当左右两边仍有剩余时
        while (le <= mid){
            tmp[i++] = a[le++];
        }
        while (m <= right){
            tmp[i++] = a[m++];
        }

        //复制回原数组
        for (int j = 0; j < i; j++){
            a[left+j] = tmp[j];
        }
    }

    public void mergeSort(int[] a,int start, int end,int[] tmp){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(a, start, mid, tmp);
            mergeSort(a, mid + 1, end, tmp);
            merge(a, start, mid, end,tmp);
        }
        System.out.print("");
    }

}
