package week3.assingment;

public class Factorial {
	public static void main(String[] args) {
		//Declare a variable and initialize value need to find factorial
		int a=6;
		//Declare a new variable and assign value as 1 to store the value
		int fact=1;
		//Finds the factorial using for
		for(int i=a;i>=1;i--) {
			//5*4*3*2*1 Factorial Value is Executed
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+"="+fact);
		}
	}


