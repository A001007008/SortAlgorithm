package arithmetic.sort;

import java.util.Arrays;

public class InjectSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5, };
        injectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void  injectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
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
