package arithmetic.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr){
        for (int d = arr.length/2; d >0; d=d/2) {
            for (int i =d ; i <arr.length ; i++) {
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
