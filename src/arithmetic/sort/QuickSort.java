package arithmetic.sort;

import java.util.Arrays;
/*
* 快速排序的核心思想是，通过将一个数组拆分成很多份进行排序，
* 我们只需要在数组中找一个标准（假设为第一个元素），将数组分成比这个标准大的和比这个标准小的两份
* 依次类推，我们就可以得到4份、8份
* 最终只需要两两比较就可以得出一个排列好的数组了，这样说可能比较抽象，下面我们看看代码
* 时间复杂度为O(n*log2n)
* */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 9, 52, 64, 8, 5, 3, 65, 0, 5};
		Quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	//快速排序需要传入起始，结尾作为我们的定位的坐标。我们的排序是通过在数组两头开始寻找。
	//右往左寻找比标准小的，左往右寻找比标准大的，
	// 所以坐标的作用是定位当前的位置，如果low和high两个坐标相等时，说明现在两头的遍历到了同一个地方。
	private static void Quicksort(int[] arr,int start ,int end) {
		if(start<end) {
			//同样我们需要一个标准来对数组进行分组（代码中我们以每次循环的数组中第一个数来作为标准）
			int low=start;//坐标
			int high=end;//坐标
			int stander=arr[start];//标准
			//坐标对比，如何头的坐标和尾的坐标不想等，说明数组还没有遍历完
			while(low<high) {
			//从右往左找比标准小的数
			while(low<high&&stander<=arr[high]) {
				high--;
			}
			if(low<high) {
				arr[low]=arr[high];
			}
			//从左往右找比标准大的数
			while(low<high&&stander>=arr[low]) {
				low++;
			}
			if(low<high) {
				arr[high]=arr[low];
			}
			}
			//最终将标准放到中间位置
			arr[low]=stander;
			//数组已经分成两份了，左边比标准小，右边比标准大，所以递归调用，将两份继续拆分
			Quicksort(arr, start, low);
			Quicksort(arr, low+1, end);
		}
      
	}
	
}
