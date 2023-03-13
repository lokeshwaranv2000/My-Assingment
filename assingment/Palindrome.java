package week3.assingment;

public class Palindrome {
	public static void main(String[] args) {
		//Declare and initialize a new String
		String str="malayalam";
		//Declare as Empty string
		String rev="";
		//Access the Character in String using Loop the Index Value to Initialize
		for(int i=str.length()-1;i>=0;i--) {
			//convert character to reverse string
			rev=rev+str.charAt(i);
		}
		//compare the string
			if(str.equals(rev))
				System.out.println(str+ "is palindrome");
			else
				System.out.println(str+ "This is not a palindrome name");
			
			
			
		}
	}


