package week2.day4;

public class Calculator {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subractionTwoNumber(int e,int f) {
	    int g=e-f;
	    System.out.println(g);
	}
	public void multiplicationTwoNumber(double i,double j) {
		double h=i*j;
		System.out.println(h);
		
		
	}
    public void divisionTwoNumber(float x,float y) {
    	float m=x/y;
    	System.out.println(m);
    	
    }
    public static void main(String[] args) {
    	Calculator myCalc=new Calculator();
        myCalc.additionTwoNumber(23,74);
    	myCalc.subractionTwoNumber(46,54);
    	myCalc.multiplicationTwoNumber(22.34, 78.65);
    	myCalc.divisionTwoNumber(6467.76f, 8456.87f);
    	
    	
    }
          

}
