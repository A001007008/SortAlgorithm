package arithmetic.sort;

import java.util.Arrays;

/*
* 归并排序，归并排序的核心是将数组划分为多份，两两比较，将小的数存放到新的数组里面
* 需要配合图去理解
* */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5, };
//        int[] array=new int[]{1,2,3,8,9,2,3,4,6};
//        merge(array,0,(array.length-1)/2,array.length-1);
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //通过递归的思想，将数组拆分为一份一份（最终拆分为两两一份）
    private static void mergeSort(int[] arr, int low, int high) {
        int middle= (low+high)/2;
        if(low<high){
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
    }

    //排序算法，通过中间值将数组划分为两份（前提是两份必须是有序的），然后两份中的数进行两两比较，将小的
    //放到新的数组里面，最后将值放回到原数组中
    private static void merge(int[] arr, int low, int middle, int high) {
        //新数组
        int[] temp=new int[high-low+1];
        int i=low;
        int j=middle+1;
        int index=0;
        //以i和j为坐标将数组分成两份（两份有序），然后两两比较，将较小的数存放到新的数组里面
        while (i<=middle&&j<=high){
            if (arr[i]<arr[j]) {
                temp[index]=arr[i];
                i++;
            }else {
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
        //当两份数组有一份已经取完的情况下，我们将另一份数组剩下的继续存取到新数组里面
        while(i<=middle){
            temp[index]=arr[i];
            i++;
            index++;
        }
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }

        //将新数组的数据存放到旧数组里面
        for (int k = 0; k <temp.length ; k++) {
            arr[k+low]=temp[k];
        }
    }
}
