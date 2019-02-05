package arithmetic.sort;

import java.util.Arrays;

/**
 * 
 * 冒泡排序的核心： 一趟中通过每个数中两两对比，将最大的数往数组后排浮动
 * 
 * @author A001007008
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
/**
 * 
 * 算法的核心就是通过两个for循环实现，第一个for循环控制趟数，
 * 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 ；10个元素里面需要两两对比的次数为9次(length-1)
 * 第二个for循环控制两两对比的次数，在第一趟中，需要进行两两比较的是所有元素(即将65冒泡出来的过程)，
 * 而在第二次的比较中,65这个数字已经在上一轮中被确定为是最大的,所以不需要比较。
 * 假设每一趟排序都只能浮出一个元素的情况下(有可能多个)，我们只需要在每次对比的时候，执行次数减去当前已经进行过得趟数就可以了
 */
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
