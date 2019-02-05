package arithmetic.sort;

import java.util.Arrays;

/**
 * ��������ĺ��ģ���ͨ�����������ΪС���⣬���з�ΪС����ȥ���
 * �������У�����ͨ��һ����׼�����������Ԫ�ص�λ�ý������򣬱��������һ�ߣ�����С������һ�ߣ�Ȼ��ͨ���ݹ�
 * ���ظ��������зֳɺܶ�С���飬���������
 * [10, 9, 52, 64, 8, 5, 3, 65, 0, 5]������ͨ��10Ϊ��׼���������Ϊ
 * [5, 9, 0, 3, 8, 5, 10, 65, 64, 52],���ֻҪ��10ǰ�����������ٽ��в������Ϳ�����
 * ���ǿ����������Ҫ˼��
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
	 * ʵ�ֵ�ԭ������ͨ����������low��high�����ж�λ���ڵ�λ�ã���ǰ��������������غϵ�ʱ��(low=high)��˵�������Ѿ�������ɡ�
	 * ����[10(low), 9, 52, 64, 8, 5, 3, 65, 0, 5(high)],����ͨ������׼��ȡ������10����������Ѱ�ұ�10С�������ҵ�5��Ȼ��5������10���ó�
	 * [5(low-->), 9(low-->), 52(low), 64, 8, 5, 3, 65, 0, 5(high)]��Ȼ���������Ѱ�ұ�10��������ҵ�52����52������5��λ�ã�һֱѭ����ֱ��
	 * ������10Ϊ�ֽ罫�����Ϊ[5, 9, 0, 3, 8, 5, 10, 65, 64, 52]��
	 * �ݹ���õ�ʱ��Ҫ��Ҫ�ȶ�start��end�����ж�,���ֻ��һ��Ԫ�صĻ���stand=end
	 * stander<=arr[high]һ��Ҫע���ж���ȵ������û���ж���ȵ�����£����������Ԫ����ȵĻ�����������ͬ��Ԫ�ػ᲻�ϵĶԻ������������ѭ����
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
