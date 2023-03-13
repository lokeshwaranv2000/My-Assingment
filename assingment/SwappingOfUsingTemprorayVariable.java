package week3.assingment;

public class SwappingOfUsingTemprorayVariable {
	public static void main(String[] args) {
		//Declare the integer Data Type and initialize variable
		int a=7;
		int b=8;
		//Declare the integer Data Type c is a new variable
		int c=a;
		//assign the value of 'b' to 'a'
		a=b;
		//assign the value of 'c' to 'b'
		b=c;
		//swapping the value 
		System.out.println("Swapped value of a="+a);
		System.out.println("Swapped value of b="+b);
		//swapped a,b and 'c' is an Temporary variable then finally Executed the result
	}

}
