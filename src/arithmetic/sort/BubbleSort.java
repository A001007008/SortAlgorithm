package arithmetic.sort;

import java.util.Arrays;

/**
 * 
 * ð������ĺ��ģ� һ����ͨ��ÿ�����������Աȣ�����������������Ÿ���
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
 * �㷨�ĺ��ľ���ͨ������forѭ��ʵ�֣���һ��forѭ������������
 * 10, 9, 52, 64, 8, 5, 3, 65, 0, 5 ��10��Ԫ��������Ҫ�����ԱȵĴ���Ϊ9��(length-1)
 * �ڶ���forѭ�����������ԱȵĴ������ڵ�һ���У���Ҫ���������Ƚϵ�������Ԫ��(����65ð�ݳ����Ĺ���)��
 * ���ڵڶ��εıȽ���,65��������Ѿ�����һ���б�ȷ��Ϊ������,���Բ���Ҫ�Ƚϡ�
 * ����ÿһ������ֻ�ܸ���һ��Ԫ�ص������(�п��ܶ��)������ֻ��Ҫ��ÿ�ζԱȵ�ʱ��ִ�д�����ȥ��ǰ�Ѿ����й��������Ϳ�����
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
