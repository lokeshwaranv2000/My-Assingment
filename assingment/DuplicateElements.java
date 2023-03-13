package week3.assingment;

public class DuplicateElements {
	public static void main(String[] args) {
		//Declare and initialize array need to check the value
		int number[]= {1,4,5,8,9,2,3,2};
		//Access element in array using nested for loop
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				//compare the elements
				if(number[i]==number[j]) {
					//print the duplicate value in the array
					System.out.println("DuplicateElements:"+number[i]);
				}
			}
		}
	}

}
