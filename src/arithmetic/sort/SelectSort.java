package arithmetic.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5, };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if (minIndex !=i ) {
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
