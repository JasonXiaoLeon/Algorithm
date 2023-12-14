package alogrithmStudy;

public class MergeSort {
	//归并排序
	//首先分为分和合并，分的话每次分一半，所以是log2(N) 每一层交换的次数是N 时间复杂度O(N*logN)
	//最好和最差都是O(N*logN) 暂时忽略递归的时间复杂度
	//空间复杂度O(N) 稳定
	//TimSort多路归并，原本分两块归并，而Timsort分为多块，两两归并，即用了二分插入排序，也用了归并排序
	public static void main(String[] args) {
		//int[] arr= {5,3,6,8,1,7,9,4,2};
		int[] arr = {1,4,7,8,3,6,9};
		sort(arr,0,arr.length-1);
		print(arr);
	}
	public static void sort(int[] arr,int left, int right) {
		if(left==right) return;
		//分成两半
		int mid = left + (right-left)/2;//防止越界  (left+right)/2 可能越界
		//左边排序
		sort(arr,left,mid);
		//右边排序
		sort(arr,mid+1,right);
		merge(arr,left,mid+1,right);
	}
	
	static void merge(int[] arr, int leftPtr, int rightPtr,int rightBound) {
		//左指针指向左边距 右指针中间位置 右指针指向右边界
		int mid = rightPtr-1;//arr.length>>1;
		int[] temp = new int[rightBound-leftPtr+1];
		int i = leftPtr;
		int j =rightPtr;
		int k = 0;
		while(i<=mid && j<=rightBound) {
			temp[k++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
		}
		while(i<=mid) temp[k++] = arr[i++];
		while(j<=rightBound) temp[k++] = arr[j++];
		
		for(int m = 0;m<temp.length;m++) arr[leftPtr+m] = temp[m];
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
