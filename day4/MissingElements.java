package week1.day4;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,7,3,2,4,6,8}; 
		Arrays.sort(input);
		int length=input.length;
		int j=5;
		for(int i=0;i<=length;i++) {
			if(i==length) {
				break;
			}
			else if(input[i]!=j) {
				System.out.println("The missing number is "+j);
				break;
			}
			
		}
			}
		}
			
	


