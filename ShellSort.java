package alogrithmStudy;

public class ShellSort {
	//希尔排序面试考察不多，是插入排序的优化版本
	//空间复杂度O(1) 时间复杂度O(n^1.3) 采用不同的序列会有不同的时间复杂度
	public static void main(String[] args) {
		int[] arr = {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
		
		sort(arr);
		print(arr);
	}
	static void sort(int[] arr){
		
		int h0 =1;
		while(h0<=arr.length/3) {
			h0=h0*3 + 1;
		}
		
		//希尔排序习惯用h来代表gap
		for(int h = h0;h>0;h=(h-1)/3) {
			
			for(int i=h;i<arr.length;i++) { 
				for(int j=i;j>h-1;j-=h) {
								if(arr[j]<arr[j-h]) {
						swap(arr,j,j-h);
					}
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
	//knuth序列
	//h=1
	//h=3*h+1
	//1,4,13,40, .......
	
	
	
	
	
	
}


