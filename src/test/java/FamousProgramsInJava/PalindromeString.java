package FamousProgramsInJava;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str = "121";
		int ln = str.length()-1;
		String rev = "";
		
		while(ln>=0) {	
		rev = rev + str.charAt(ln);
		ln--;	
		}
		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + rev);
	
	if(str.equals(rev)) {
		System.out.println("Given string is a palindrome");
	}
	else {
		System.out.println("Given string is not a palindrome");
	}
}
}
