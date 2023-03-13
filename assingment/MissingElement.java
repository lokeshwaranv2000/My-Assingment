package week3.assingment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		//Declare and initialize array
		int[] number= {1,5,9,6,4,8,2};
		//sort the array
		Arrays.sort(number);
		//compare the digits with their +1 number
		for(int i=0;i<number.length;i++) {
			if(number[i]!=i+1) {
				//print the missing element
				System.out.println("Missing element="+(i+1));
				//break the loop
				break;
			}
		}
	}

}
