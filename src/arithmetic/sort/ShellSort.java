package arithmetic.sort;

import java.util.Arrays;
/*
* 希尔排序的核心其实就是插入排序的升级版，它将数组按照步长分组，先大致的将数组排序一遍，再进行插入排序
* 步长我们以数组长度/2作为步长
* 然后将相隔同样步长的元素分为一组
* 再进行插入排序，直到步长最后为1，普通插入排序
* */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr){
        //d为步长
        for (int d = arr.length/2; d >0; d=d/2) {
            //arr.length-d表示一共有多少组，然后遍历每一组，
            for (int i =d ; i <arr.length ; i++) {
                //j=i-d表示是每组的第一个元素
                for (int j=i-d;j>=0;j--){
                    if (arr[j]>arr[j+d]){
                        int temp=arr[j+d];
                        arr[j+d]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    }
}
