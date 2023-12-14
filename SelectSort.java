package alogrithmStudy;

public class SelectSort {
	public static void main(String[] args) {
		//选择排序 最好的情况最坏的情况都是O(n^2)，且不具备稳定性。
		//优化 可以同时寻找最大的Position，每次比较也可以比较后两个数字的大小，这样可以减少循环次数
		//时间复杂度O(n^2) 空间复杂度(1)
		int[] arr = {5,3,6,8,1,7,9,4,2};
		
		for(int i=0;i<arr.length-1;i++) {
			//外层循环少一次，因为第二层循环
			int minPos=i;	
			for(int j=i+1;j<arr.length;j++) {
				//方法1
//				if(arr[j]<arr[minPos]) {
//					minPos=j;
//				}
				//方法2
				minPos = arr[j]<arr[minPos] ? j:minPos;
			}
			
			System.out.println("MinPos："+minPos);

			swap(arr,i,minPos);
			
			System.out.println("经过第"+i+"次循环后，数组的内容：");
			print(arr);
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
