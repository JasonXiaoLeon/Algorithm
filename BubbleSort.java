package alogrithmStudy;

public class BubbleSort {
	//冒泡排序 时间复杂度O(n^2) 空间复杂度O(1)
	//最坏时间复杂度O(n^2) 最好的时间复杂度O(n) 稳定
	public static void main(String[] args) {
		int[] a= {9,3,1,4,6,8,7,5,2};
		sortJason(a);
		print(a);
	}
	
	static void sort(int[] a) {
		for(int i=a.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	
	static void sortJason(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
					swap(a,i,j);
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
}
