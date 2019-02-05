package arithmetic.sort;

import java.util.Arrays;

/**
 * 快速排序的核心，是通过将大问题分为小问题，再切分为小问题去解决
 * 在数组中，我们通过一个标准对数组里面的元素的位置进队排序，比它大的排一边，比它小的排另一边，然后通过递归
 * 再重复将数组切分成很多小数组，来达成排序
 * [10, 9, 52, 64, 8, 5, 3, 65, 0, 5]，我们通过10为标准，将数组分为
 * [5, 9, 0, 3, 8, 5, 10, 65, 64, 52],随后只要以10前后两个数组再进行拆分排序就可以了
 * 这是快速排序的主要思想
 * @author A001007008
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 9, 52, 64, 8, 5, 3, 65, 0, 5};
		Quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 实现的原理：我们通过两个坐标low和high来进行定位现在的位置，当前后两个坐标进行重合的时候(low=high)则说明数组已经遍历完成。
	 * 数组[10(low), 9, 52, 64, 8, 5, 3, 65, 0, 5(high)],我们通过将标准提取出来，10，从右往左寻找比10小的数，找到5，然后将5拷贝到10；得出
	 * [5(low-->), 9(low-->), 52(low), 64, 8, 5, 3, 65, 0, 5(high)]，然后从左往右寻找比10大的数，找到52，将52拷贝到5的位置，一直循环，直到
	 * 数组以10为分界将数组分为[5, 9, 0, 3, 8, 5, 10, 65, 64, 52]。
	 * 递归调用的时候要主要先对start和end进行判断,如果只有一个元素的话，stand=end
	 * stander<=arr[high]一定要注意判断相等的情况。没有判断相等的情况下，如果有两个元素相等的话，则两个相同的元素会不断的对换，程序进入死循环。
	 * @param arr
	 * @param start
	 * @param end
	 */
	public static void Quicksort(int[] arr,int start ,int end) {
		if(start<end) {
			int low=start;
			int high=end;
			int stander=arr[start];
			while(low<high) {
			while(low<high&&stander<=arr[high]) {
				high--;
			}
			if(low<high) {
				arr[low]=arr[high];
			}
			while(low<high&&stander>=arr[low]) {
				low++;
			}
			if(low<high) {
				arr[high]=arr[low];
			}
			}
			arr[low]=stander;
			Quicksort(arr, start, low);
			Quicksort(arr, low+1, end);
		}
      
	}
	
}
