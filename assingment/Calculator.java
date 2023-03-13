package week3.assingment;

public class Calculator {
	//declare the method return the integer value parameter are passing in the argument
	public static int addTwoNumber(int a,int b) {
		   //declare the integer data type and declare c
		   int c=a+b;
		   System.out.println(c);
		   return c;
	}
	public int subTwoNumber(int a,int b) {
		//declare the integer data declare in c
		int c=a-b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		//object as created for calc
		Calculator calc=new Calculator();
		calc.addTwoNumber(600,200);
		calc.subTwoNumber(100, 200);
		
		
		
		
		
		   
		
	
		
	}

}
