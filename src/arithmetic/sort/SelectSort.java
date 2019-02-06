package arithmetic.sort;

import java.util.Arrays;
/*
* 选择排序和核心以每个位置的元素为开始的标准，往前找，如果找到比标准小的就将标准换为小的数，直到遍历完数组
* 时间复杂度为O(n2)
* */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5, };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        //外层循环遍历所有元素
        for (int i = 0; i <arr.length ; i++) {
            //取出当前位置的元素，作为标准
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                //内层循环是往前找比标准小的数
                if (arr[minIndex]>arr[j]){
                    //找到比当前标准小的数，将小的数作为标准
                    minIndex=j;
                }
            }
            //如果当前作为标准的数的坐标不等于初始值，则发生互换
            if (minIndex !=i ) {
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
