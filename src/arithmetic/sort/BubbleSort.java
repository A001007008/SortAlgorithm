package arithmetic.sort;

import java.util.Arrays;

/*
* 冒泡算法的核心就是通过两两比较，每一次浮出一个最大的数
* 算法时间复杂度为O(n2)
*
* */

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		//外层循环控制一共有多少趟（一趟浮出1个最大的数，所以理论上应该有arr.length-1趟）
		for(int i=0;i<arr.length;i++) {
			//内层循环控制两两对比，对比的次数应该为arr.length-1次(5个元素只需要对比4次)，
			//由于每一趟都能冒出一个最大值，所以已经循环了多少趟，就应该有多少个元素是已经排序的，所以对比的次数需要减去趟数
			//也可以理解为，一趟浮出一个最大数，这个最大数已经确认了，所以不需要再比较了
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
