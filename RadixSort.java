package alogrithmStudy;

import java.util.Arrays;

public class RadixSort {
	//Least significant digit first
	public static void main(String[] args) {
		int[] arr= {421,240,115,532,305,430,124};
		int maxDigit = findMaxDigit(arr);
		int[] result=sort(arr, maxDigit);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sort(int[] arr, int maxDigit) {
		int[] result=new int[arr.length];
		int[] count=new int[10];
		
		for(int i=0;i<maxDigit;i++) {
			int division = (int)Math.pow(10, i);
			System.out.println(division);
			for(int j=0;j<arr.length;j++) {
				int num=arr[j]/division%10;
				System.out.println(num + " ");
				count[num]++;
			}
			System.out.println();
			System.out.println(Arrays.toString(count));
			for(int m=1;m<count.length;m++) {
				count[m] = count[m]+count[m-1];
			}
			System.out.println(Arrays.toString(arr));
			for(int n=arr.length-1;n>=0;n--) {
				int num= arr[n]/division%10;
				result[--count[num]]=arr[n];
			}
			System.arraycopy(result,0,arr,0,arr.length);
			Arrays.fill(count,0);
		}
		return result;
	}
	
	// 寻找数组中所有数字的最高位数
    private static int findMaxDigit(int[] numbers) {
        int maxDigit = 0;

        for (int number : numbers) {
            int digit = findDigit(number);
            maxDigit = Math.max(maxDigit, digit);
        }

        return maxDigit;
    }

    // 寻找一个数字的最高位数
    private static int findDigit(int number) {
        // 将数字转换为字符串，然后获取字符串的长度即为最高位数
        String numberStr = Integer.toString(number);
        return numberStr.length();
    }
}
