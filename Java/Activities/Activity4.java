package hello;

import java.util.Arrays;

public class Activity4 {
	public static void main(String args[]) {
		int[] num = {4,6,3,5,1};
		System.out.println("Before Sorting "+Arrays.toString(num));
		
		for(int i=1;i<num.length;i++) {
			int temp = num[i];
			int j = i-1;
			while (j >=0 && temp< num[j] ) {
				num[j+1]= num[j];
				--j;
				
				
			}
			num[j+1]=temp;	
			
		}
		
	System.out.println("After Sorting " +Arrays.toString(num));
	}}

