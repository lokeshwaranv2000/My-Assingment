package week3.assingment;

public class ReverseString {
	public static void main(String[] args) {
		//Declare the String data Type and variable name as Str
		String str="Lokeshwaran";
		//given Array has Char
		char[] ch=str.toCharArray();
		//initialize the length of array index value 0 to 4 reduce 1 in the index value
		for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
		
	}

}
}
