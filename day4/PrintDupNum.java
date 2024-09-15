package week1.day4;

import java.util.Arrays;

public class PrintDupNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num= {2,5,7,7,5,9,2,3};
	
		System.out.println(num[2]);
		Arrays.sort(num);
		System.out.println(num[3]);
		int lengthOfArray = num.length;
		for(int i=0;i<lengthOfArray;i++) {
			System.out.println(num[i]);
		}
		
			
	

	}

}
