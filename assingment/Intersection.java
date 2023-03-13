package week3.assingment;

public class Intersection {
	public static void main(String[] args) {
		//Declare and initialize array
		int[] arr1= {5,4,6,3,1};
		int[] arr2= {5,4,8,7,3};
		//Access the elements and compare it using nested for loop
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				//comparing arrays
				if(arr1[i]==arr2[j]) {
					//print the elements
					System.out.print(arr1[i]+"");
				}
			}
		}
		
	}

}
