package arithmetic.sort;

import java.util.Arrays;
/*
* 插入排序的思想是把数组开始的部分认为是有序的，然后再将后面的数进行插入
* 核心是两个循环，第一个是正向遍历，第二个是反向遍历
* 为什么需要两个遍历呢？
* 我们把开始部分认为是有序的。{1，0,5,3}，所以1是有序的
* 然后正向遍历，发现0比1小，所以我们要将0插入到合适的位置上。
* 所以反向遍历有序部分，寻找比0小的数，没有放在第一个
* 时间复杂度为O(n2)
* */
public class InjectSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5, };
        injectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void  injectSort(int[] arr){
        //两层循环，第一层正向遍历
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                //第二层反向遍历
                for (int j=i;j>=0;j--){
                    if(arr[j+1]<arr[j]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }
}
