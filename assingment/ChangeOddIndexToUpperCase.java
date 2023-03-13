package week3.assingment;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//Declare the String Data Type
		String text="life";
		//convert the string into character array
		char[] ch=text.toCharArray();
		//Access the element in array using for loop
		for(int i=0;i<ch.length;i++) {
			//check the condition odd index or not
			if(i%2!=0) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
	}
     System.out.print(ch);
	}
}
		
	


