package alogrithmStudy;

public class InsertionSort {

	public static void main(String[] args) {
		//插入排序
		//时间复杂度O(n^2) 空间复杂度O(1)
		//最好情况下的时间复杂度O(n) 最坏情况下的时间复杂度O(n^2)
		//比冒泡排序快一倍 少了很多次交换的操作 也比选择排序快一点
		//样本比较小且基本有序的情况下选择插入排序，效率高
		int[] a= {9,3,1,4,6,8,7,5,2};
		sort(a);
		print(a);
	}
	
	static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
		//抽出第i张牌
			for(int j=i;j>0;j--) {
		//和第i张牌之前的一张排比
				if(arr[j]>arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
		
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	//优化
//	static void sort1(int[] arr) {
//		for(int i=1;i<arr.length;i++) {
//			for(int j=i;j>0 && arr[j]>arr[j-1];j--) {
//		//把if判断放入for循环
//				//if(arr[j]>arr[j-1]) {
//					swap(arr,j,j-1);
//				//}
//			}
//		}
		
}

