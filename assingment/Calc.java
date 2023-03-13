package week3.assingment;

public class Calc {
	public  int addTwoNumber(int a,int b) {
		//declare the integer value stored in variable c
		int c=a+b;
		return c;
	}
	//Method has calling a  Argument initializing integer value
	public void subTwoNumber(int sum,int b) {
		//declare the integer value Stored in c and declare the Sum of value 
		int c=sum-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//object is created initialized as Calculator
		Calc Calculator=new Calc();
		//method are passing in the argument
		int sum=Calculator.addTwoNumber(100,200);
		System.out.println(sum);
		//declare value in the method argument
		Calculator.subTwoNumber(sum,20);
	}

}
